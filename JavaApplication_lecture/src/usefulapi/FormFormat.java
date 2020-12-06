package usefulapi;

import java.text.*;

public class FormFormat {
	public static void main(String[] args) 
	{
		String msg = "이름: {0} \t전화번호: {1} \t주소:{2}";
		Object[] person1 = {
			"박문석","010-3790-1997", "서울시 양천구 목동"
		};
		Object[] person2 = {
				"제시카","010-3139-1997", "뉴질랜드 크라이스처치"
			};

		String result = MessageFormat.format(msg, person1);
		System.out.println(result);
		result = MessageFormat.format(msg, person2);
		System.out.println(result);
	}
}

