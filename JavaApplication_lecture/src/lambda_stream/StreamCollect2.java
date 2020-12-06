package lambda_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCollect2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student(1, "김좌진", "남자", "컴퓨터공학과", 80),
			new Student(2, "홍범도", "남자", "기계공학과", 92), 
			new Student(3, "유관순", "여자", "컴퓨터공학과", 87),
			new Student(4, "윤봉길", "남자", "컴퓨터공학과", 85), 
			new Student(5, "남자현", "여자", "전자공학과", 78));
	
		// 데이터 개수
		long cnt = list.stream().count();
		System.out.println("데이터 개수:" + cnt);
		cnt = list.stream().collect(Collectors.counting());
		System.out.println("데이터 개수:" + cnt);
		
		// 점수 합계
		int sum = list.stream().mapToInt(Student::getScore).sum();
		System.out.println("점수 합계:" + sum);
		sum = list.stream().collect(Collectors.summingInt(Student::getScore));
		System.out.println("점수 합계:" + sum);
		
		// 최대값
		Optional<Student> top = list.stream().max(Comparator.comparingInt(Student::getScore));
		System.out.println(top);
		top = list.stream().collect(Collectors.maxBy(Comparator.comparingInt(Student::getScore)));
		System.out.println(top);

	}
}
