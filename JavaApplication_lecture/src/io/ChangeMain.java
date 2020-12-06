package io;

import java.io.FileOutputStream;
import java.io.PrintStream;
public class ChangeMain {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("./test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps);
		} catch (Exception e) {
			System.err.println("잘못된 파일 경로입니다.");
		}
		System.out.println("Hello by System.out");
		System.err.println("Hello by System.err");
	}
}
