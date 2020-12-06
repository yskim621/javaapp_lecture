package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SequenceMain {
	public static void main(String[] args) {
		byte[] ar1 = { 0, 1, 2 };
		byte[] ar2 = { 3, 4, 5 };
		
		byte[] outSrc = null;

		// 2개의 스트림을 리스트에 저장
		List <ByteArrayInputStream> list = new ArrayList<ByteArrayInputStream>();
		list.add(new ByteArrayInputStream(ar1));
		list.add(new ByteArrayInputStream(ar2));
		
		// 리스트의 요소를 이용해서 연결된 스트림 객체 생성
		SequenceInputStream input = new SequenceInputStream(list.get(0), list.get(1));
		// 바이트 배열 출력 스트림 생성
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		int data = 0;

		// 연결된 스트림 객체의 모든 내용을 읽어서 출력 스트림에 기록
		try {
			while ((data = input.read()) != -1) {
				output.write(data);
			}
		} catch (IOException e) {
		}

		// 출력 스트림에 기록된 내용을 배이트 배열에 저장
		outSrc = output.toByteArray();
		// 데이터 출력
		System.out.println("Input Source1  :" + Arrays.toString(ar1));
		System.out.println("Input Source2  :" + Arrays.toString(ar2));
		System.out.println("Output Source  :" + Arrays.toString(outSrc));
	}
}

