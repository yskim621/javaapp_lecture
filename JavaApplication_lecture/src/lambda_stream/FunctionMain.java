package lambda_stream;

import java.util.*;
import java.util.function.*;

public class FunctionMain {

	private static List<Person> list = 
		Arrays.asList(
			new Person("김좌진", 90), 
			new Person("홍범도", 95));
	
	public static void strPrint(Function<Person, String> function) {
		for(Person person : list) {
			System.out.println(function.apply(person));
		}
		System.out.println();
	}
	public static void main(String[] args) {
		strPrint( t->t.getName());
	}
}