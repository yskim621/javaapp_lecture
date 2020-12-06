package io;

import java.io.File;

public class FileInfo {
	public static void main(String args[]) {
		String str = "";
		//자신의 컴퓨터에 있는 파일의 경로로 변경해야 합니다.
		File file = new File("./src/chap13/FileInfo.java");

		if (file.exists()) {
			str += "파일명: " + file.getName() + "\n" + "파일의 크기 : "
					+ file.length() + "\n" + "마지막 수정일 : " + file.lastModified()
					+ "\n" + "부모 디렉토리 : " + file.getParent();
		} else {
			str = "해당파일이 존재하지 않습니다.";
		}
		System.out.println(str);
		System.out.println("==================");
		// 프로젝트 디렉토리의 모든 내용 출력
		File dir = new File("./");
		String[] strs = dir.list();
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
