package practice.chap05;

import java.util.Scanner;

public class Rank {
	public static void main(String[] args) {
		int[] ar = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ar.length; i = i + 1) {
			System.out.print("숫자를 입력하세요:");
			ar[i] = sc.nextInt();
		}

		int[] rank = new int[5];
		// 순위를 전부 1로 초기화
		for (int i = 0; i < rank.length; i = i + 1) {
			rank[i] = 1;
		}

		for (int i = 0; i < ar.length; i = i + 1) {
			for (int j = 0; j < ar.length; j = j + 1) {
				if (ar[i] < ar[j]) {
					rank[i] = rank[i] + 1;
				}
			}
		}
		System.out.println("입력한 숫자");
		for (int i = 0; i < ar.length; i = i + 1) {
			System.out.println(ar[i] + ":" + rank[i] + "등");
		}
		sc.close();
	}
}
