package io;

import java.io.*;

public class FileStreamMain {
	public static void main(String[] args) {
		// 현재 디렉토리의 byte.txt 파일에 바이트 단위로 데이터를 기록할 수 있는
		// 파일출력스트림 생성 - 이렇게 생성하면 close 하지 않아도 됨
		try (FileOutputStream fos = new FileOutputStream("./byte.txt")) {
			// 기록할 바이트 배열 생성
			byte[] b = { 'H', 'e', 'l', 'l', 'o' };
			// 파일출력스트림에 b의 내용을 바이트 단위로 기록
			fos.write(b);
			// 버퍼의 내용을 전부 출력
			fos.flush();
			// 스트림 닫기
			System.out.println("파일 쓰기에 성공했습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 생성되지 않습니다.\n 경로를 확인하세요");
		} catch (Exception e) {
			System.out.println("파일에 쓰기를 실패 했습니다.\n 내용을 확인하세요");
		}
		
		// 현재 디렉토리의 byte.txt 파일에서 바이트 단위로 데이터를 읽을 수 있는
		// 파일입력스트림 생성 - 이렇게 생성하면 close 하지 않아도 됨
		try (FileInputStream fis = new FileInputStream("./byte.txt")) {
			// 파일의 크기만큼의 바이트 배열을 생성
			byte[] b = new byte[(fis.available())];
			// 데이터 읽기
			fis.read(b);
			// 읽은 데이터를 출력
			for (byte temp : b) {
				System.out.print((char) temp + ",");
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.\n 경로를 확인하세요");
		} catch (Exception e) {
			System.out.println("파일에서 읽기를 실패 했습니다.\n 내용을 확인하세요");
		}
	}
}
