package usefulapi;

import java.util.*;
public class MenuHash {
	public static void main(String[] args) {
		String [] file = {"Open", "Close", "Save"};
		String [] edit = {"Copy", "Cut", "Paste"};
		String [] view = {"Max", "Min", "Normal"};
		String [][]menu;
		menu = new String[3][];
		menu[0] = file;
		menu[1] = edit;
		menu[2] = view;
		String temp[];
		for(int i=0; i<menu.length; i++){
			if(i==0)	System.out.print("파일:");
			else if(i==1) System.out.print("편집:");
			else System.out.print("보기:");
			temp = menu[i];
			for(String imsi : temp)
				System.out.printf("%-10s", imsi);
			System.out.println();
		}
		System.out.println("===============================");
		System.out.println("===============================");
		HashMap <String, String[]>menuMap = new HashMap<String, String[]>();
		menuMap.put("파일", file);
		menuMap.put("편집", edit);
		menuMap.put("보기", view);
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
