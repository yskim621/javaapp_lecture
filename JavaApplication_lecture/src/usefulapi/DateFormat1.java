package usefulapi;

import java.text.*;
import java.util.*;  //Date

public class DateFormat1
{
	public static void main(String args[])
	{
		Date day=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 EEE요일 a hh시 mm분 ss초");
		System.out.println(sdf.format(day));  
	}
}
