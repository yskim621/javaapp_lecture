package practice.chap05;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요:");
		int year = sc.nextInt();
		
		System.out.print("월을 입력하세요:");
		int month = sc.nextInt();
		
		int nalsu = 0;
		//입력한 년도 이전 년도까지의 날 수를 전부 더함
		for(int i=1; i<year; i=i+1) {
			if(i%4==0 && i%100!=0 || i%400==0) {
				nalsu = nalsu + 366;
			}else {
				nalsu = nalsu + 365;
			}
		}
		//올해 각 달의 날 수 배열 생성 
		int [] months = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%4==0 && year%100!=0 || year%400==0) {
			months[2] = 29;
		}
		int week = nalsu % 7 - 1;
		int [][] calendar = new int[6][7];
		for(int i=week; i <= months[month] + week; i=i+1) {
			calendar[i/7][i%7] = i - week;
		}
		
		//달력 출력
		System.out.println("  월 화 수 목 금 토 일");
		for(int i=0; i<6; i=i+1) {
			for(int j=0; j<7; j=j+1) {
				if(calendar[i][j] != 0) {
					System.out.printf("%3d", calendar[i][j]);
				}else {
					System.out.printf("   ");
				}
			}
			System.out.print("\n");
		}

		
		sc.close();

	}
}
