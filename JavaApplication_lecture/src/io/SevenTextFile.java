package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SevenTextFile {

	public static void main(String[] args) {
		Path path =  Paths.get("./sample.txt");
		try(BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
			writer.append("우리나라");
			writer.newLine();
			writer.append("대한민국");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			for(String line; (line = reader.readLine()) != null;) {
				System.out.println(line);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

		
