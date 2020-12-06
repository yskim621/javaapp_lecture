package practice.chap05;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < lotto.length; i = i + 1) {
			System.out.print("숫자를 입력하세요:");
			int su = sc.nextInt();
			//1부터 45사이의 숫자가 아니면 이번에는 무효
			if(su < 1 || su > 45) {
				System.out.println("1~45사이의 숫자만 입력하세요");
				i = i - 1;
				continue;
			}
			//이전 데이터와 비교
			boolean flag = false;
			for(int j=0; j<=i-1; j=j+1) {
				if(su == lotto[j]) {
					flag = true;
				}
			}
			//이전에 입력된 숫자이면 무효
			if(flag == true) {
				System.out.println("중복된 숫자입니다.");
				i = i - 1;
				continue;
			}
			lotto[i] = su;
		}

	
		for (int i = 0; i < lotto.length; i = i + 1) {
			System.out.println(i + ":" + lotto[i]);
		}
		sc.close();
	}
}
