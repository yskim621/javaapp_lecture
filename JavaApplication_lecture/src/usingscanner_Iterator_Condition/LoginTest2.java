package usingscanner_Iterator_Condition;

import java.util.Scanner;
public class LoginTest2 {
	public static void main(String[] args) {
		String id = null;
		String password = null;
		Scanner input = new Scanner(System.in);
		System.out.print("아이디를 입력하세요: ");
		id = input.next();
		System.out.print("비밀번호를 입력하세요: ");
		password = input.next();
		
		if (id.equals("root") && password.equals("system")) {
			System.out.println("로그인 성공");
		} else if (id.equals("root")) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("없는 아이디 입니다.");
		}
		input.close();
	}
}
