package practice.chap11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice2 {
	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object>map = new HashMap<String, Object>();
		map.put("num", 1);
		map.put("name", "예지");
		map.put("phone", "014");
		map.put("address", "서울");
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("num", 2);
		map.put("name", "채령");
		map.put("phone", "015");
		map.put("address", "논산");
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("num", 3);
		map.put("name", "유나");
		map.put("phone", "016");
		map.put("address", "원주");
		list.add(map);
		
		System.out.printf("%4s\t%6s\t%10s\t%10s\n", "번호","이름","전화번호","주소");
		for(Map<String, Object> temp : list) {
			System.out.printf("%4s\t%6s\t%10s\t%10s\n", temp.get("num"), temp.get("name"), temp.get("phone"), temp.get("address"));
		}
	}
}
