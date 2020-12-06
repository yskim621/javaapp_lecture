package usefulapi;

import java.util.*;
public class Arrays2 {
	public static void main(String args[]) {
		Data data[] = {
				new Data("lee", 1),
				new Data("park", 2), 
				new Data("kim", 3),
		};

		for (Data temp : data)
			System.out.println(temp);
		Arrays.sort(data);
		System.out.println("정렬 후");
		for (Data temp : data)
			System.out.println(temp);
	}
}
