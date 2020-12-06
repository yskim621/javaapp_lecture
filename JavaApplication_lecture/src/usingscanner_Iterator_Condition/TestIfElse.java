package usingscanner_Iterator_Condition;

import java.util.Scanner;

public class TestIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력:");
		int score = sc.nextInt();

		// score가 60이상이면 합격 아니면 불합격 이라고 출력
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("당신의 점수는" + score + "입니다");
		sc.close();
	}
}
