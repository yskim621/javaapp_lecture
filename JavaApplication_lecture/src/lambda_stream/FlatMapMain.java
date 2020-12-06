package lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapMain {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java8 lambda", "stream mapping");
		list.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word -> System.out.println(word));

		Stream<String[]> ar = Stream.of(new String[] { "베이브루스", "루게릭", "타이콥" },
				new String[] { "사이영", "랜디존슨", "페드로마르티네스" });
		Stream<String> stream = ar.flatMap(Arrays::stream);
		stream.forEach(str -> System.out.println(str));

	}
}
