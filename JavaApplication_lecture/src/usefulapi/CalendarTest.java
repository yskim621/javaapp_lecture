package usefulapi;

import java.util.Calendar;

class CalendarTest 
{
	public static void main(String[] args) 
	{
		Calendar date = Calendar.getInstance();
		int y = date.get(Calendar.YEAR);
		int w = date.get(Calendar.WEEK_OF_YEAR);
		int m = date.get(Calendar.MONTH)+1;
		int d = date.get(Calendar.DATE);
		System.out.println("오늘 날짜는 " + y +"년 " + w + "주차 " + m + "월 "+ d +"일");
	}
}

