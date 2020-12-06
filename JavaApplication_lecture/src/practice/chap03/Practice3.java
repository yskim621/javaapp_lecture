package practice.chap03;

import java.util.Scanner;
//섭씨 온도를 화씨 온도로 변경하는 문제
//수식 : 화씨 온도 = 9 / 5 * 섭씨온도 + 32 
//섭씨 32도는 화씨로는 89.6도
public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변환하고자 하는 섭씨 온도를 정수로 입력하세요:");
		int celsius = sc.nextInt();
		//이 부분에 코드를 작성해서 출력하세요
		double fahrenheit = 9.0/5.0 * celsius + 32;
		System.out.println("썹씨 " + celsius + "도는 화씩 " + fahrenheit + "도 입니다.");
		sc.close();
	}
}
