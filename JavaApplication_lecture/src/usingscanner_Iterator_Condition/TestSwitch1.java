package usingscanner_Iterator_Condition;

import java.util.Scanner;

public class TestSwitch1 {

	public static void main(String[] args) {
		// 키보드로부터 입력받기 위한 객체를 생성
		Scanner sc = new Scanner(System.in);
		// 메뉴 입력받기
		System.out.print("메뉴 입력(1-한식 2-중식 3-분식 기타-일식):");
		int menu = sc.nextInt();
		
		//읽기 전용의 변수를 생성
		final int KOREA = 1;
		final int CHINA = 2;
		final int SNACKBAR = 3;
		
		//menu의 값에 따른 분기
		switch(menu) {
		case KOREA:
			System.out.println("한식");
			break;
		case CHINA:
			System.out.println("중식");
			break;
		case SNACKBAR:
			System.out.println("분식");
			break;
		default:
			System.out.println("일식");
			break;
		}

		sc.close();
	}
}



