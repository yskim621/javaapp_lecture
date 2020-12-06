package usefulapi;

import java.util.*;
//1986년 5월 5일 부터 지나간 날짜와 시간을 구하기
public class DateGap {
	public static void main(String[] args) {
		final String[] DAYOFWEEK = { "", "일", "월", "화", "수", "목", "금", "토" };
		Calendar date1 = new GregorianCalendar();
		Calendar date2 = new GregorianCalendar();
		date1.set(1986, 4, 5);
		System.out.println("제시카를 만난 날은 " + date1.get(Calendar.YEAR) + "년 "
				+ (date1.get(Calendar.MONTH) + 1) + "월 "
				+ date1.get(Calendar.DATE) + "일 "
				+ DAYOFWEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고 ");
		System.out.println("오늘은 " + date2.get(Calendar.YEAR) + "년 "
				+ (date2.get(Calendar.MONTH) + 1) + "월 "
				+ date2.get(Calendar.DATE) + "일 "
				+ DAYOFWEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
		long gap = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("우리가 만난지 오늘은 " + gap / (24 * 60 * 60) + "일째 입니다."); 
	}
}

