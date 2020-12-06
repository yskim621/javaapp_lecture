package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputMain {

	public static void main(String[] args) {
		String insa = "Hello";
		// 문자열의 바이트 크기만큼 배열 생성
		byte[] outSrc = new byte[insa.getBytes().length];
		// 문자열을 바이트 배열로 변환해서 읽을 수 있는 스트림으로 변환
		ByteArrayInputStream bais = new ByteArrayInputStream(insa.getBytes());
		// 바이트 배열에 데이터를 기록할 수 있는 스트림 생성
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		int idx = 0;
		try {
			while (true) {
				// bais의 소스에서 outSrc의 크기만큼을 읽어서 outSrc에 저장하고 읽은 개수를 idx에 저장
				idx = bais.read(outSrc);
				// 읽은 데이터가 없으면 읽기 중단
				if (idx == -1)
					break;
			}
			// 읽은 데이터를 출력
			for (byte b : outSrc) {
				System.out.println((char) b);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// 스트림 닫기
			try {
				bais.close();
				baos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
