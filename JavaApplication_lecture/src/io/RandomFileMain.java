package io;

import java.io.*;

public class RandomFileMain {
	public static void main(String args[]) {
		String output = "";
		String str = "";
		try {
			RandomAccessFile file = new RandomAccessFile("./randomtest.txt", "rw");
			String k = new String("Bye Bye Java");
			file.seek(file.length());
			file.write(k.getBytes());
			file.writeChar('\n');
			file.seek(0);
			while (file.getFilePointer() < file.length()) {
				output += file.getFilePointer();
				output += ":";
				str = file.readLine();
				output += str + "\n";
				System.out.println(output);
			}
			file.close();
		}
		catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
		System.exit(0);
	}
}

