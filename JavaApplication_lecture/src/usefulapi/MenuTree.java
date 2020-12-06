package usefulapi;

import java.util.*;

public class MenuTree {
	public static void main(String[] args) {
		String [] file = {"Open", "Close", "Save"};
		String [] edit = {"Copy", "Cut", "Paste"};
		String [] view = {"Max", "Min", "Normal"};
		TreeMap <String, String[]>menuMap = new TreeMap<String, String[]>();
		menuMap.put("file", file);
		menuMap.put("edit", edit);
		menuMap.put("view", view);
		Set<String>set = menuMap.keySet();
		Iterator<String>it = set.iterator();
		String key = "";
		String menuTemp[];
		while(it.hasNext()){
			key = it.next();
			System.out.print(key + ":");
			menuTemp = menuMap.get(key);
			for(String imsi:menuTemp){
				System.out.printf("%-10s", imsi);
			}
			System.out.println();
		}
	}
}

