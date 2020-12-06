package datastructure_variable_format_typecasting;
public class Variable 
{
	public static void main(String args[])
	{
		//정수를 저장할 수 있는 변수를 선언
		int a;
		//정수 변수에 값을 대입
		a = 10;
		System.out.println("a=" + a);
		
		//정수 변수에 값을 대입 - 기존의 값 대신에 새로운 값이 대입
		a = 20;
		System.out.println("a=" + a);
		
		//정수 변수 값을 더해서 출력
		System.out.println("a + a= " + (a+a));
		
		//선언과 동시에 초기화
		int b = 30; 
		System.out.println("b=" + b);
		
		//실수 변수를 생성하고 값을 저장
		float f;
		f = 0.123456789f; 
		System.out.println("f = " + f);
		
		double d;
		d = 0.12345678901234567;
		System.out.println("d = " + d);
	}
}
