package usefulapi;

import java.util.*;
public class Arrays1 {

	public static void main(String[] args) {
		String [] ar = {"morning", "afternoon", "evening", "night"};
		//정렬하지 않은 상태에서는 binary search를 제대로 수행하지 못합니다.
		System.out.println("morning의 위치:" + Arrays.binarySearch(ar, "morning"));
		//데이터 정렬 : 배열의 각 멤버가 Comparable 인터페이스의 메소드를 구현해야 합니다.
		Arrays.sort(ar);
		System.out.println("morning의 위치:" + Arrays.binarySearch(ar, "morning"));
	}
}

