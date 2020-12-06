package lambda_stream;

import java.util.ArrayList;
import java.util.List;
public class MethodArg {
	public static void main(String[] args) {
		List<Person> singerList = new ArrayList<>();
		singerList.add(new Person("수지", 100));
		singerList.add(new Person("아이린", 90));
		singerList.add(new Person("제니", 92));
		singerList.add(new Person("쯔위", 88));
		singerList.add(new Person("모모", 98));
		
		singerList.forEach(System.out::println);
	}
}

