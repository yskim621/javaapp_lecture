package practice.chap03;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("판별하고자 하는 년도를 입력하세요:");
		int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year +"년은 윤년입니다.");
		}
		else {
			System.out.println(year +"년은 윤년이 아닙니다.");
		}
		sc.close();
	}
}