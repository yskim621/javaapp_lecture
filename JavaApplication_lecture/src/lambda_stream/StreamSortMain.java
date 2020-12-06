package lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamSortMain {
	public static void main(String[] args) {
		//Comparable 인터페이스가 구현된 경우
		int [] ar = {5, 3, 2, 1, 4};
		IntStream intStream = Arrays.stream(ar);
		System.out.println("오름차순 정렬");
		
		intStream
			.sorted()
			.forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		//Comparator를 직접 구현하는 경우
		System.out.println("점수의 내림차순 정렬");
		List<Student> list = Arrays.asList(
				new Student(1, "김좌진", "남자", "컴퓨터공학과", 80 ),
				new Student(2, "홍범도", "남자", "기계공학과", 92),
				new Student(3, "유관순", "여자", "컴퓨터공학과", 87),
				new Student(4, "윤봉길", "남자", "컴퓨터공학과", 85),
				new Student(5, "남자현", "여자", "전자공학과", 78)
					);
		list.stream()
		.sorted((n1, n2)->{
				return n2.getScore() - n1.getScore();
			})
		.forEach(word -> System.out.println(word));

	}
}
