package datastructure_variable_format_typecasting;

public class TypeCasting {
	public static void main(String args[]) {
		// 변수 선언(정수형)
		byte b = 100;
		short s = 1000;
		int i = 10000;
		long l = 10L; // L은 형 명시

		// 변수 선언(문자형)
		char c = 'A';

		// 변수 선언(실수형)
		float f = 3.14f; // f는 형 명시 ==> f를 빼고 테스트 하면 error
		double db = 5.15d; // d는 형 명시 ==> d를 빼도 문제 없음

		// 변수 선언(boolean형)
		boolean bo = true; // ==> true/false를 대문자로 쓰면 error
		System.out.println("b=" + b);
		System.out.println("s=" + s);
		System.out.println("i=" + i);
		System.out.println("l=" + l);
		System.out.println("c=" + c);
		System.out.println("f=" + f);
		System.out.println("db=" + db);
		System.out.println("bo=" + bo);

		// 강제 형변환
		f = (float) 1.5;// 실수는 기본적으로 double형임
		System.out.println("f=" + f);

		f = (float) db;
		System.out.println("f=" + f);

		// 실수를 정수로 강제 형 변한하면 소수는 사라집니다.
		i = (int) db;
		System.out.println("i=" + i);
	}
}