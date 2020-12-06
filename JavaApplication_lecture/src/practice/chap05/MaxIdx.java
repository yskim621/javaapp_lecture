package practice.chap05;

import java.util.Scanner;

public class MaxIdx {
	public static void main(String[] args) {
		int [] ar = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<ar.length; i=i+1) {
			System.out.print("숫자를 입력하세요:");
			ar[i] = sc.nextInt();
		}
		
		int max = ar[0];
		int idx = 0;
		for(int i=0; i<ar.length; i=i+1) {
			if(max < ar[i]) {
				max = ar[i];
				idx = i;
			}
		}
		
		System.out.println("가장 큰 숫자는 " + max + "이고 " + idx + "번째에 위치");
		sc.close();
	}
}
