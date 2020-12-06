package practice.chap11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Practice3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		Random r = new Random();
		
		//6개의 숫자를 Set에 저장
		Set<Integer>lottoSet = 
				new HashSet<Integer>();
		
		while(lottoSet.size() != 6){
			lottoSet.add(r.nextInt(45) + 1);
		}
		
		//Set의 데이터를 List에 저장
		for(int temp : lottoSet) {
			list.add(temp);
		}
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		System.out.println(list);
	}
}
