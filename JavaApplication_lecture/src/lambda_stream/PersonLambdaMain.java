package lambda_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonLambdaMain {

	public static void main(String[] args) {
		List<Person> singerList = new ArrayList<>();
		singerList.add(new Person("수지", 100));
		singerList.add(new Person("아이린", 90));
		singerList.add(new Person("제니", 92));
		singerList.add(new Person("쯔위", 88));
		singerList.add(new Person("모모", 98));
		
		//1.7이전 버전에서의 List 정렬 
		//메소드를 매개변수로 사용할 수 없기 때문에 메소드를 구현한 객체를 매개변수로 대입
		Collections.sort(singerList, new Comparator<Person>() {
			@Override
			public int compare(Person singer1, Person singer2) {
				return singer1.getScore() - singer2.getScore();
			}
		});
		for(Person person : singerList) {
			System.out.println(person);
		}
		
		System.out.println("===========================");
		//람다를 이용한 정렬
		Collections.sort(singerList, 
				(singer1, singer2) -> singer1.getScore()-singer2.getScore());
		for(Person person : singerList) {
			System.out.println(person);
		}
	}
}
