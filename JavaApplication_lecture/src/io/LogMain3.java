package io;

import java.io.*;
public class LogMain3 {
	public static void main(String[] args) {
		int sum = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("./log.txt"))) {
			while (true) {
				try {
				String x = br.readLine();
				if (x == null)
					break;
				String[] ar = x.split(" ");
				if (!ar[9].equals("-")) {
					sum = sum + Integer.parseInt(ar[9]);
				}
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("일일 트래픽:" + sum + "바이트");
	}
}