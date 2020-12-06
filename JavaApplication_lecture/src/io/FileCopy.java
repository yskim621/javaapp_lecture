package io;

import java.io.*;
public class FileCopy {
	public static void main(String args[]) {
		int r=-1;
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader(new File("./test.txt"));
			writer = new FileWriter(new File("./copy.txt"));
			while ((r = reader.read()) != -1){
				writer.write(r);
			}
			System.out.println("파일쓰기에 성공했습니다. \n");
			System.out.println("두 개의 파일을 열어서 확인해 보시기 바랍니다.");
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}