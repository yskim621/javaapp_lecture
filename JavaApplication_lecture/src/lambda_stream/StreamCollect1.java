package lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollect1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student(1, "김좌진", "남자", "컴퓨터공학과", 80),
			new Student(2, "홍범도", "남자", "기계공학과", 92), 
			new Student(3, "유관순", "여자", "컴퓨터공학과", 87),
			new Student(4, "윤봉길", "남자", "컴퓨터공학과", 85), 
			new Student(5, "남자현", "여자", "전자공학과", 78));
	
		// 남자들만 묶어 List 생성
		List<Student> manList = list.stream().filter(s -> s.getGender().equals("남자")).collect(Collectors.toList());
		manList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println("================");
		// 여자들만 묶어 Set 생성
		Set<Student> womanSet = list.stream().filter(s -> s.getGender().equals("여자")).collect(Collectors.toSet());
		womanSet.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println("================");
		// 모든 데이터를 name을 키로해서 Map 생성
		Map<String, Student> map = list.stream().collect(Collectors.toMap(Student::getName, item -> item));
		System.out.println(map);
	}
}
