package io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriter {
	public static void main(String[] args) {
		String inputData = "안녕하세요 반갑습니다.";
		StringReader input = new StringReader(inputData);
		StringWriter output = new StringWriter();

		int data = 0;

		try {
			while (true) {
				data = input.read();
				if (data == -1)
					break;
				output.write(data);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Input Data  :" + inputData);
		System.out.println("Output Data :" + output.toString());
	}
}
