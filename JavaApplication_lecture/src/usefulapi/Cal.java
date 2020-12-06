package usefulapi;

import java.io.*;
import java.util.*;

public class Cal {
	public static void main(String[] args) {
		final String[] DAYOFWEEK = {"일", "월", "화", "수", "목", "금", "토" };
		String imsi = "";
		int year = 0;
		int month = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("달력 출력");
		try {
			while (true) {
				System.out.print("년도를 입력하세요(4자리로 입력):");
				imsi = in.readLine();
				if (imsi.compareTo("0001") >= 0 && imsi.compareTo("9999") <= 0)
					break;
				else
					System.out.println("올바르게 입력하세요!!!");
			}
			year = Integer.parseInt(imsi);
			while (true) {
				System.out.print("월을 입력하세요(2자리로 입력):");
				imsi = in.readLine();
				if (imsi.compareTo("01") >= 0 && imsi.compareTo("12") <= 0)
					break;
				else
					System.out.println("올바르게 입력하세요!!!");
			}
			month = Integer.parseInt(imsi);
		} catch (Exception e) {
			System.out.println("입력 예외 발생");
		}
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		Calendar startDay = Calendar.getInstance();
		Calendar endDay = Calendar.getInstance();

		startDay.set(year, month - 1, 1);
		endDay.set(year, month, 1);
		endDay.add(Calendar.DATE, -1);
		// 1일의 요일을 구합니다.
		START_DAY_OF_WEEK = startDay.get(Calendar.DAY_OF_WEEK);
		// 월의 마지막 날을 찾아옵니다.
		END_DAY = endDay.get(Calendar.DATE);

		System.out.println("      " + year + "년 " + month + "월");
		for(int i=0; i<7; i++)
			System.out.printf("%4s",DAYOFWEEK[i]);
		System.out.println();

		// 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력합니다.
		for (int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.printf("%4s", " ");
		}

		for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.printf("%4d", i);
			if (n % 7 == 0)
				System.out.println();
		}
	}
}
