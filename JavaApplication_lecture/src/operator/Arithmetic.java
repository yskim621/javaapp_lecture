package operator;

public class Arithmetic {
	public static void main(String args[]) {
		int a = 11, b = 2;
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		//정수 와 정수 연산이므로 결과는 정수
		int div = a / b;
		//나머지 연산
		int mod = a % b;
		
		System.out.println("a+b=" + add);
		System.out.println("a-b=" + sub);
		System.out.println("a*b=" + mul);
		System.out.println("a/b=" + div);
		System.out.println("a/b=" + (float) a / b);
		System.out.println("a%b=" + mod);
				
		//양수와 음수 사이에서의 나머지
		System.out.println("5%-2=" + (5%-2));
		//음수와 양수 사이에서의 나머지
		System.out.println("-5%2=" + (-5%2));
		//음수와 음수 사이에서의 나머지
		System.out.println("-5%-2=" + (-5%-2));
	}
}

