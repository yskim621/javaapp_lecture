package operator;

public class Fix {
	public static void main(String args[]) {
		int a=10;
		System.out.println("a = " + a);
		System.out.println("후위 연산 - a = " + a++);
		System.out.println("a = " + a);
		// 증감을 하기 전에 명령문을 먼저 처리하므로 10 출력
		// 연산 후의 결과는 11
		
		a = 10;
		System.out.println("전위 연산 - a = " + ++a);
		System.out.println("a = " + a);
		// 증감을 한 후에 명령문을 처리하므로 11 출력
		// 연산 후의 결과는 11
	}
}

