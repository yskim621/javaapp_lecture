package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferEnterMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String input = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("입력:");
			input = br.readLine();
			System.out.println(input);

			System.out.print("입력:");
			input = sc.nextLine();
			System.out.println(input);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
