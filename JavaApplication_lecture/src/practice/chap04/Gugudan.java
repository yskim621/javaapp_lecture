package practice.chap04;

import java.util.Scanner;

//입력한 숫자에 해당하는 구구단 출력
public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 9까지의 임의의 숫자를 입력하세요:");
		int su = sc.nextInt();
		for(int i=1; i<10; i=i+1) {
			System.out.println(su + " * " + i + " = " + (su*i));
		}
		
		sc.close();
		
	}
}
