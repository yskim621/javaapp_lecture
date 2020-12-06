package practice.chap03;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("물건 가격을 입력하세요:");
		int money = sc.nextInt();
		
		int hundred = money / 100;
		int fifty = (money - (hundred * 100)) / 50;
		int ten = money % 50;
		
		System.out.println("거스름 돈은 " + (1000 - money) + "원");
		System.out.println("100원" + hundred + "개");
		System.out.println("50원" + fifty + "개");
		System.out.println("10원" + ten + "개");
		
		sc.close();
	}
}
