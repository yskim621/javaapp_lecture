package io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SevenFileCopy {

	public static void main(String[] args) {
		Path from = Paths.get("./pro.xml");
		Path to = Paths.get("./copy.xml");
		
		try {
			Files.copy(from, to);
			System.out.println("파일 복사 성공");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
