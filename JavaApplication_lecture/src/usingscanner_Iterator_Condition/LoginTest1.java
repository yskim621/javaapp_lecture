package usingscanner_Iterator_Condition;

import java.util.Scanner;

public class LoginTest1 {
	public static void main(String[] args) {
		String id = null;
		String password = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요: ");
		id = sc.next();
		System.out.print("비밀번호를 입력하세요: ");
		password = sc.next();

		if (id.equals("root") && password.equals("system")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		sc.close();
	}
}
