package io;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class LogMain2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		try (BufferedReader br = new BufferedReader(new FileReader("./log.txt"))) {
			while (true) {
				String x = br.readLine();
				if (x == null)
					break;
				String[] ar = x.split(" ");
				set.add(ar[0]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("접속한 IP 개수:" + set.size());
	}
}