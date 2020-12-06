package usefulapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Local {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // 오늘의 날짜
		LocalTime now = LocalTime.now(); // 현재 시간

		LocalDate meetDay = LocalDate.of(1986, 5, 5); // 1986년 5월 5일
		LocalTime meetTime = LocalTime.of(13, 30, 0); // 13시 30분 0초

		System.out.println("today=" + today);
		System.out.println("now=" + now);
		System.out.println("meetDay=" + meetDay); 
		System.out.println("meetTime=" + meetTime);

		System.out.println(meetDay.withYear(2000)); // 2000-5-5
		System.out.println(meetDay.plusDays(1)); // 1986-5-6
	}
}
