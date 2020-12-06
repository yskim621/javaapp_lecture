package practice.chap04;

import java.util.Scanner;
//소수 체크
public class PrimeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int su = sc.nextInt();

		boolean flag = true;
		for(int i=2; i<= su/2; i=i+1) {
			if(su % i == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println(su + "는 소수입니다.");
		}else {
			System.out.println(su + "는 소수가 아닙니다.");
		}
		sc.close();
	}
}
