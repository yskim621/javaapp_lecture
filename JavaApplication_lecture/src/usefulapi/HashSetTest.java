package usefulapi;

import java.util.*;

public class HashSetTest {
    public static void main(String args[]) {
		String[] str = {"2","3","3","1"};      
		HashSet<String> hs = new HashSet<String>();
		for (String n : str){
          		if (!hs.add(n))
			System.out.println(n + "이 존재해서 삽입하는데 실패");              
		}
		//전체 데이터 출력
		System.out.println("hs : " + hs);
		System.out.println("================");
		//각각 데이터 접근
		for (String n : hs){
          		System.out.println(n);              
		}
		System.out.println("================");
		Iterator<String>it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
    }
}

