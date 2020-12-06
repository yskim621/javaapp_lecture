package lambda_stream;

import java.util.*;
import java.util.function.*;

public class PredicateMain {
	public static int avg(List<Person> list, Predicate<Person> predicate) {
		int cnt = 0;
		for (Person person : list) {
			if (predicate.test(person)) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("김좌진", 87), new Person("윤봉길", 90), new Person("유관순", 95),
				new Person("홍범도", 89));
		int count = avg(list, t -> t.getScore() >= 90);
		System.out.println("90 이상인 인원 수: " + count);
	}
}
