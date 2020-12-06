package class_constructor_getter_setter;

import java.util.*;

public class FiboMain {

	public static int fibo(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fibo(n - 1) + fibo(n - 2);
	}
	public static void main(String[] args) {
		int n = -1;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("알고 싶은 피보나치 수열의 값은 몇번째?");
			n = in.nextInt();
			if (n < 1)
				System.out.println("1이상의 정수를 입력하세요");
			else
				break;
		}
		in.close();
		System.out.println("입력한 " + n + "번째 피보나치의 값은 " + fibo(n) + "입니다");
	}
}

