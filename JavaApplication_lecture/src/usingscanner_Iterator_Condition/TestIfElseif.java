package usingscanner_Iterator_Condition;

import java.util.Scanner;

public class TestIfElseif {
	public static void main(String args[]) {
		int jumsu = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		jumsu = input.nextInt();
		if (jumsu >= 90 && jumsu <= 100) {
			System.out.println("당신은 학점은 A입니다.");
		} else if (jumsu >= 80 && jumsu < 90) {
			System.out.println("당신은 학점은 B입니다.");
		} else if (jumsu >= 70 && jumsu < 80) {
			System.out.println("당신은 학점은 C입니다.");
		} else if (jumsu >= 60 && jumsu < 70) {
			System.out.println("당신은 학점은 D입니다.");
		} else if (jumsu >= 0 && jumsu < 60) {
			System.out.println("당신은 학점은 F입니다.");
		} else {
			System.out.println("잘못된 점수입니다.");
		}
		input.close();
	}
}
