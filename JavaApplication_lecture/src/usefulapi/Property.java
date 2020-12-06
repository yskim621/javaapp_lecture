package usefulapi;

import java.io.*;
import java.util.*;
public class Property {
	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.setProperty("name", "Park");
		pro.setProperty("address", "Seoul");
		pro.setProperty("number", "1");
		Enumeration<Object> keys = pro.keys();
		Enumeration<Object> values = pro.elements();
		while (keys.hasMoreElements())
			System.out.println(keys.nextElement() + ":" + values.nextElement());
		try {
			pro.store(new FileOutputStream("pro.txt"), "텍스트로 내보내기");
			pro.storeToXML(new FileOutputStream("pro.xml"), "xml로 내보내기");
		} catch (IOException e) {
			System.out.println("저장 실패");
		}
	}
}

