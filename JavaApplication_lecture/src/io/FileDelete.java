package io;

import java.io.*;

public class FileDelete {
	public static void delete(String filename) {
		// 파일이름을 나타내기 위해, File 객체를 생성
		File f = new File(filename);
		// 파일이나 디렉토리가 존재하는지와 쓰기 방지가 되어 있는지를 확인
		if (!f.exists()) {
			System.out.println("Delete : 파일을 찾을 수 없습니다. : "
					+ filename);
			System.exit(0);
		}
		if (!f.canWrite()) {
			System.out.println("Delete : 쓰기 방지가 되어서 삭제할 수 없습니다. : " + filename);
			System.exit(0);
		}
		
		// 디렉토리이면, 비어있는지 확인
		if (f.isDirectory()) {
			String[] files = f.list();
			if (files.length > 0)
			System.out
			.println("Delete : 디렉토리가 비어 있지 않습니다. : " + filename);
			System.exit(0);
		}
		// 모든 검사를 통과했으면 파일 삭제
		boolean success = f.delete();
		if (!success)
			System.out.println("Delete :  파일 삭제 실패");
		else
			System.out.println("Delete :  파일 삭제 성공");
	}
	
	public static void main(String[] args) {
		delete("./pro.txt");
	}

}
