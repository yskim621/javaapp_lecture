package lambda_stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//컬렉션의 다양한 접근
public class StreamCreate {

	public static void main(String[] args) {
		String[] ar = { "김좌진", "홍범도", "유관순" };
		System.out.println("=====배열로부터 스트림 생성====");
		Stream<String> arStream = Arrays.stream(ar);
		arStream.forEach(e -> System.out.println(e));
		System.out.println("==============");

		List<String> list = Arrays.asList("김좌진", "홍범도", "유관순");
		System.out.println("=====리스트로부터 스트림 생성====");
		Stream<String> listStream = list.stream();
		listStream.forEach(e -> System.out.println(e));
		System.out.println("==============");

		System.out.println("=====정수 범위로부터 스트림 생성====");
		IntStream intStream = IntStream.range(100, 104);
		intStream.forEach(e -> System.out.println(e));
		System.out.println("==============");

		// 무한 개수의 랜덤한 정수 스트림을 생성
		IntStream randomStream = new Random().ints();
		// 3개만 출력 구문 수행
		randomStream.limit(3).forEach(n -> System.out.println(n));
		System.out.println("======================");
		try {
			// 현재 디렉토리를 가지고 스트림을 생성
			Stream<Path> path = Files.list(Paths.get("./"));
			path.forEach(n -> System.out.println(n));
			path.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}