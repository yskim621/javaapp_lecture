package practice.chap05;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요:");
		int year = sc.nextInt();
		
		System.out.print("월을 입력하세요:");
		int month = sc.nextInt();
		
		System.out.print("일을 입력하세요:");
		int day = sc.nextInt();
		
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
		//올해 지나온 달의 날 수를 모두 더함
		for(int i=0; i<month; i=i+1) {
			nalsu = nalsu + months[i];
		}
		
		//일 더하기
		nalsu = nalsu + day - 1;
		
		//요일 배열
		String [] weekday = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		System.out.println(year +"년 " + month + "월 " + day + "일은 " + weekday[nalsu % 7] + "입니다.");
		sc.close();
	}
}
