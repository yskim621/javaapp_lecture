package lambda_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMatchMain {
	public static void main(String[] args) {
		Stream<String[]> ar = Stream.of(
		new String[]{"베이브루스", "루게릭", "타이콥"},
		new String[]{"사이영", "랜디존슨", "페드로마르티네스"}
			);
			Stream<String> stream = ar.flatMap(Arrays::stream);
			boolean result = 
					stream.anyMatch(name -> name.length()>6);
			System.out.println("결과:" + result);
	}
}
