package io;

import java.io.*;

public class DataIOMain {
	public static void main(String[] args) {
		try (DataOutputStream dataout = new DataOutputStream(new FileOutputStream("./test.txt"))) {
			dataout.writeInt(123);
			dataout.writeChar('k');
			dataout.writeDouble(123.4);
		} catch (Exception e) {
			System.out.println("파일에 기록하는 것을 실패했습니다.");
			System.err.println(e.getMessage());
			System.exit(0);
		}
		try (DataInputStream datain = new DataInputStream(new FileInputStream("./test.txt"))) {
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
		} catch (Exception e) {
			System.out.println("파일에서 읽기에 실패했습니다.");
			System.err.println(e.getMessage());
			System.exit(0);
		}
	}
}