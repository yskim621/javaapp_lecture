package usingscanner_Iterator_Condition;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ConsoleInput {
	public static void main(String[] args) {
		String name = "noname";
		int age = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("이름을 입력하세요: ");
			name = in.readLine();
			System.out.print("나이를 입력하세요: ");
			age = Integer.parseInt(in.readLine());
		} catch (Exception e) {
			System.out.println("입력 오류:"+ e.getMessage());
		}
		System.out.println("이름:" + name + "\t나이:" + age);
	}
}