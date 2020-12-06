package usefulapi;

import java.util.*;
public class Arrays3 {
	public static void main(String[] args) {
		Data data[] = {
				new Data("lee", 1),
				new Data("park", 2), 
				new Data("kim", 3),
		};
		for(Data temp : data)
			System.out.println(temp);
		//Comparable 인터페이스를 implements 하지 않은 경우
		Comparator<Data>comp = 
				new Comparator<Data>(){
					@Override
					public int compare(Data o1, Data o2) {
						return o1.getName().compareTo(o2.getName());
					}
		};
		Arrays.sort(data, comp);
		System.out.println("정렬 후");
		for(Data temp : data)
			System.out.println(temp);
	}
}
