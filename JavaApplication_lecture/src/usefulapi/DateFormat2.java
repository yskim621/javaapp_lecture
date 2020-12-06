package usefulapi;

import java.io.*;
import java.text.*;
import java.util.*; 

public class DateFormat2 {
	public static void main(String args[]) {
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		Date inDate = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("날짜를 " + pattern + "의 형태로 입력해주세요.(입력 예:1986/05/05):");
		while (true) {
			try {
				inDate = df.parse(in.readLine());
				break;
			} catch (Exception e) {
				System.out.print("날짜를 " + pattern
						+ "의 형태로 입력해주세요.(입력 예:1986/05/05):");
			}
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis())
				/ (60 * 60 * 1000);

		System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
	}
}
