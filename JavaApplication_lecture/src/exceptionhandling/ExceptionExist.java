package exceptionhandling;

public class ExceptionExist 
{
	public static void main(String[] args) 
	{
		func();                 //메소드 호출
	}
	
	public static void func() 
	{
		int i = 1;
		int j = 0;
		System.out.println(i/j);    // 1을 0으로 나눈다. 예외 발생
	}
}
