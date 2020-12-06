package lambda_stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("김좌진", "홍범도", "윤동주");

		// for 문 이용
		System.out.println("일반 for 문 이용");
		for(int i=0; i<list.size(); i++){
			String name = list.get(i);
			System.out.println(name);
		}
		System.out.println("===========================");
		// Iterator 이용
		System.out.println("Iterator 이용");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println("===========================");
		// 빠른 열거 이용
		System.out.println("빠른 열거 이용");
		for (String imsi : list) {
			System.out.println(imsi);
		}
		System.out.println("===========================");
		// Stream 이용
		System.out.println("Stream 이용");
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}
