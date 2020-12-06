package usefulapi;

import java.util.ArrayList;
public class TestArrayList {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("오늘은");
		al.add("2012년");
		al.add("12월 18일");
		System.out.println("al의 크기" + al.size()); // 결과 : al의 크기3
		al.add("화요일 입니다.");
		for (int a = 0; a < al.size(); a++) {
			System.out.println(al.get(a));
		}
		System.out.println("================");
		System.out.println("al의 크기" + al.size()); // 결과 : al의 크기4
		al.remove(1);
		System.out.println("al의 크기 " + al.size()); // 결과 : al의 크기 3
		for (int a = 0; a < al.size(); a++) {
			System.out.println(al.get(a));
		}
	}
}

