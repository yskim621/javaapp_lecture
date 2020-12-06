package io;

import java.io.*;

public class BufferReaderMain {
	public static void main(String[] args) {
		String str = ""; // 입력 받은 문자열 저장
		// BufferedReader타입의 변수 reader선언
		BufferedReader reader = null;		
		try {
			while (true) {
				System.out.print("문자열을 입력(중단은 끝):");
				// BufferedReader객체 reader생성
				reader = new BufferedReader(new InputStreamReader(System.in));

				// reader객체를 사용해서 라인 단위로 입력
				str = reader.readLine();

				// 입력한 문자열이 "끝"이면 루프 탈출
				if (str.equals("끝"))
					break;

				// 입력한 문자열 출력
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}

