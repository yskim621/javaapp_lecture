package usefulapi;

import java.util.*;

public class ConsoleInput1 {
	public static void main(String[] args) {
		// 키보드로부터 입력받는 Scanner 객체를 생성
		Scanner scanner = new Scanner(System.in);
		String id = "";
		System.out.print("아이디를 입력하세요: ");
		while (scanner.hasNextLine()) {
			id = scanner.nextLine();
			if (id.equals("root"))
				break;
			System.out.print("아이디를 다시 입력하세요: ");
		}
		System.out.print("로그인에 성공하셨습니다. ");
		scanner.close();

	}
}

