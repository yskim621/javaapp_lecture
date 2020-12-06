package operator;

public class Unary {
	public static void main(String args[]) {
		int a = 10, b = -10;
		boolean c = true, d = false;
		System.out.println("a= " + a + "\t b=" + b + "\t c=" + c + "\t d=" + d);
		System.out.println("~a=" + ~a);
		// -11 1의 보수 연산(양수-> 음수 부호가 바뀌고 1증가됨)
		System.out.println("~b=" + ~b);
		// 9 음수-> 양수 부호가 바뀌고 1감소됨
		System.out.println("!c=" + (!c) + "\t !d = " + (!d));
		System.out.println("+a=" + (+a) + "\t +b = " + (+b));
		System.out.println("-a= " + (-a) + "\t -b = " + (-b));
	}
}

