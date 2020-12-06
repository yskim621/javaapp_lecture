package lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollect3 {
		public static void main(String[] args) {
			List<Student> list = Arrays.asList(
				new Student(1, "김좌진", "남자", "컴퓨터공학과", 80),
				new Student(2, "홍범도", "남자", "기계공학과", 92), 
				new Student(3, "유관순", "여자", "컴퓨터공학과", 87),
				new Student(4, "윤봉길", "남자", "컴퓨터공학과", 85), 
				new Student(5, "남자현", "여자", "전자공학과", 78));
			
			Map<String, List<Student>> groupMap = list.stream()
					.collect(Collectors.groupingBy(Student :: getGender));
			System.out.println(groupMap);
			System.out.print("[남자] ");
			groupMap.get("남자").stream().forEach(s->System.out.print(s.getName() + " "));
			System.out.print("\n[여자] ");
			groupMap.get("여자").stream().forEach(s->System.out.print(s.getName() + " "));
		}
}
