package lambda_stream;

import java.util.function.*;

public class ConsumerMain {

	public static void main(String[] args) {
		Consumer<String> consumer = 
				t -> System.out.println(t + "1.8에서 가능");
		consumer.accept("JDK");
		
		BiConsumer<String, String> bigConsumer = 
				(t, u) -> System.out.println(t + u);
		bigConsumer.accept("JDK", "1.8에서 가능");
	}
}
