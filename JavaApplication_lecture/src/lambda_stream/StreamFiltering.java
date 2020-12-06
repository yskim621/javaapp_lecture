package lambda_stream;

import java.util.Arrays;
import java.util.List;

public class StreamFiltering {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"이신", "홍범도", "유관순", "이신", "이순신", "김유신");
		System.out.println("2개를 넘기고 3개 출력");
		list.stream().skip(2).limit(3).forEach(n -> System.out.println(n));
		System.out.println();
		System.out.println("중복 제거");
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		System.out.println("신으로 끝나는 데이터 추출");
		list.stream().filter(n -> n.endsWith("신")).forEach(n -> System.out.println(n));
		System.out.println();
		System.out.println("중복을 제거하고 신으로 끝나는 데이터 추출");
		list.stream().distinct().filter(n -> n.endsWith("신")).forEach(n -> System.out.println(n));

	}
}