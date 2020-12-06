package lambda_stream;

import java.util.Arrays;
import java.util.List;

public class StreamReduceMain {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student(1, "김좌진", "남자", "컴퓨터공학과", 80),
				new Student(2, "홍범도", "남자", "기계공학과", 92), new Student(3, "유관순", "여자", "컴퓨터공학과", 87),
				new Student(4, "윤봉길", "남자", "컴퓨터공학과", 85), new Student(5, "남자현", "여자", "전자공학과", 78));

		// Map-Reduce Programming
		int sum = list.stream().mapToInt(Student::getScore).sum();
		System.out.println("합계:" + sum);
		double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("평균:" + avg);
	}
}
