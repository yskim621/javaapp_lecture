package io;

import java.io.*;

public class LogMain1 {
	public static void main(String[] args) {
		int cnt = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("./log.txt"))) {
			while (true) {
				String x = br.readLine();
				if (x == null)
					break;
				String[] ar = x.split(" ");
				if (ar[8].equals("200")) {
					cnt = cnt + 1;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("유효한 접속 횟수:" + cnt);
	}
}
