package usefulapi;

import java.time.*;

public class DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 12, 31); // 2015년 12월 31일
		LocalTime time = LocalTime.of(12, 34, 56); // 12시 23분 56초

		// 2015년 12월 31일 12시 23분 56초
		LocalDateTime dt = LocalDateTime.of(date, time);

		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dt.atZone(zid);
		System.out.println(zdt);
		// String strZid = zdt.getZone().getId();

		ZonedDateTime seoulTime = ZonedDateTime.now();
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);
		System.out.println(seoulTime);
		System.out.println(nyTime);
	}
}
