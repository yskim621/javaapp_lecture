package usingscanner_Iterator_Condition;

import java.util.Scanner;

public class VariousInput {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("이름을 입력하세요: ");
		String name = keyboard.nextLine();
		System.out.println("안녕하세요 " + name + '님');

		System.out.print("나이를 입력하세요: ");
		int age = keyboard.nextInt();
		System.out.println(name + "님의 나이는 " + age + "세 입니다.");
		
		keyboard.close();
	}
}