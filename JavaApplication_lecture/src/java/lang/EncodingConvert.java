package java.lang;

import java.io.*;

public class EncodingConvert {
	public static void main(String args[]) {
		String str = "대한민국";
		try {
			byte[] by = str.getBytes("MS949");
			System.out.println("str:" + str);
			String msg = new String(by, "UTF-8");
			System.out.println("msg:" + msg);
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩을 지원하지 않습니다.");
		}
	}
}
