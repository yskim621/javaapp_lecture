package exceptionhandling;

import java.util.*;
public class UserException
{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		try 
		{
			System.out.print("하나의 숫자를 입력하세요=>");
			int jumsu = in.nextInt();
			if(jumsu < 0) 
			{
				throw new UserException1("점수가 너무 작음");
			}
			else if (jumsu > 100)
			{
				throw new UserException2("점수가 너무 큼");
			}
			System.out.println("정상적인 점수 입력");
		} 
		catch(UserException1 e) {
			System.out.println("UserException1 처리 루틴 : ");
			System.out.println(e + " 발생");
		}
		catch(UserException2 e) {
			System.out.print("UserException2 처리 루틴 : ");
			System.out.println(e + " 발생");    
		}
		catch(Exception e) {
			System.out.print("모든 예외 처리 루틴 : ");
			System.out.println(e + " 발생");    
		}
	}
}


//사용자 정의 예외는 Exception 클래스로부터 상속
class UserException1 extends Exception {
	private static final long serialVersionUID = 1L;

	public UserException1(String message) {
		super(message);
	}
}

class UserException2 extends Exception {

	private static final long serialVersionUID = 1L;

	public UserException2(String message) {
		super(message);
	}
}
