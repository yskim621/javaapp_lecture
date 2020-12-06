package usefulapi;

import java.util.*;
public class MapMain {
	public static void main(String[] args) {
		DTO obj1 = new DTO("1", "jesica", "ChristChurch");
		System.out.println("번호:"+obj1.getNum());
		System.out.println("이름:"+obj1.getName());
		System.out.println("주소:"+obj1.getAddress());
		System.out.println("===========================");
		
		HashMap<String, String>obj2 = new HashMap<String, String>();
		obj2.put("번호", "2");
		obj2.put("이름", "제시카");
		obj2.put("주소","크라이스처치");
		Set<String>set = obj2.keySet();
		Iterator<String>it = set.iterator();
		String key = "";
		while(it.hasNext()){
			key = it.next();
			System.out.println(key + ":" + obj2.get(key));
		}
	}
}

