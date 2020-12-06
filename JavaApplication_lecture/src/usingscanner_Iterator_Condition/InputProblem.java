package usingscanner_Iterator_Condition;

import java.util.Scanner;

public class InputProblem {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("이름을 입력하세요: ");
		String name = keyboard.nextLine();

		System.out.print("나이를 입력하세요: ");
		int age = keyboard.nextInt();
		
		//구분문자를 없애기 위해서 문자열 입력 메소드를 한 번 호출
		//keyboard.nextLine();
		
		//숫자 다음에 문자열을 바로 입력받아서 변환하고자 하면 Enter 와 같은 구분 문자를 받음 
		System.out.print("직업을 입력하세요: ");
		String job = keyboard.nextLine();
		
		System.out.println(name + "님의 나이는 " + age + "세이며 직업은 " + job +"입니다.");
		
		keyboard.close();
	}
}
