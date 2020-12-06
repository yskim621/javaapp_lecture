package datastructure_variable_format_typecasting;

public class LiteralHashcode {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		long c = 10L;

		System.out.println("a:" + System.identityHashCode(a));
		// 동일한 상수 값을 가리키므로 동일한 해시코드 출력
		System.out.println("b:" + System.identityHashCode(b));
		// 값은 같지만 데이터의 타입이 다르므로 다른 해시코드 출력
		System.out.println("c:" + System.identityHashCode(c));

	}
}
