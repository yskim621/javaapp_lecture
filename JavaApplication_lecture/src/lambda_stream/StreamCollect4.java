package lambda_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollect4 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student(1, "김좌진", "남자", "컴퓨터공학과", 80),
			new Student(2, "홍범도", "남자", "기계공학과", 92), 
			new Student(3, "유관순", "여자", "컴퓨터공학과", 87),
			new Student(4, "윤봉길", "남자", "컴퓨터공학과", 85), 
			new Student(5, "남자현", "여자", "전자공학과", 78));
		
		// 성별 평균 점수
		Map<String, Double> groupMap = list.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getScore)));
		System.out.println("남자 평균 점수: " + groupMap.get("남자"));
		System.out.println("여자 평균 점수: " + groupMap.get("여자"));

		// 학과별 1등 추출
		Map<String, Optional<Student>> topMap = list.stream().collect(Collectors.groupingBy(Student::getSubject,
				Collectors.maxBy(Comparator.comparingInt(Student::getScore))));
		Set<String> keys = topMap.keySet();
		for (String key : keys)
			System.out.println(key + ":" + topMap.get(key));

	}
}
