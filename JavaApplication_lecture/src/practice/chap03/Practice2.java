package practice.chap03;

import java.util.Scanner;
//초를 입력받아서 몇시간 몇분 몇초인지 계산하는 문제 
public class Practice2 {

	public static void main(String[] args) {
		// 콘솔로부터 입력받기 위한 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("변환하고자 하는 초를 입력하세요:");
		// 콘솔에서 정수를 입력하면 input에 저장됩니다.
		int input = sc.nextInt();
		// 이 부분에 코드를 작성해서 입력한 초가 몇시간 몇분 몇초인지 출력
		int hour = input / 3600;
		int minute = (input - (hour * 3600))/60;
		//int second = (input - (hour * 3600) - (minute * 60));
		int second = input % 60;

		System.out.println(hour + "시간 " + minute + "분 " + second + "초");

		sc.close();

	}
}
