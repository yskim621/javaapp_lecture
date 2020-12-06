package io;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TempFileUse {

	public static void main(String[] args) {
		File tempDir = new File("./");
		Path path = Paths.get("./");
		try {
			File.createTempFile("pre", ".tmp", tempDir);
			System.out.println("1.7 이전 API 활용");
			Files.createTempFile(path, "pre", ".tmp");
			Thread.sleep(10000);
			System.out.println("1.7 API 활용");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
