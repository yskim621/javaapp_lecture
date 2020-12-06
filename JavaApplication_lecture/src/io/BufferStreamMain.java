package io;

import java.io.*;

public class BufferStreamMain {
	public static void main(String[] args) {
		// buffer.txt 파일에 데이터를 바이트 단위로 기록할 수 있는 스트림 생성
		try (FileOutputStream fos = new FileOutputStream("./buffer.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			byte[] b = { 'H', 'e', 'l', 'l', 'o' };
			bos.write(b);
			bos.flush();
			System.out.println("파일 쓰기에 성공했습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 생성되지 않습니다.\n 경로를 확인하세요");
		} catch (Exception e) {
			System.out.println("파일에 쓰기를 실패 했습니다.\n 내용을 확인하세요");
		}
		
		// buffer.txt 파일에 데이터를 바이트 단위로 읽을 수 있는 스트림 생성
		try (FileInputStream fis = new FileInputStream("./buffer.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			byte[] b = new byte[(bis.available())];
			bis.read(b);
			for (byte temp : b) {
				System.out.print((char) temp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.\n 경로를 확인하세요");
		} catch (Exception e) {
			System.out.println("파일에서 읽기를 실패 했습니다.\n 내용을 확인하세요");
		}
	}
}

