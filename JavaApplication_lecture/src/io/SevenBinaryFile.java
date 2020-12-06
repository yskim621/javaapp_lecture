package io;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SevenBinaryFile {
	public static void main(String[] args) {
		Path path = Paths.get("./seven.txt");
		try(OutputStream os = Files.newOutputStream(path)){
			os.write(97);
			os.flush();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try(InputStream is = Files.newInputStream(path)){
			System.out.print((char)is.read());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}