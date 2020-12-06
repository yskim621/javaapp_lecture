package exceptionhandling;
import java.util.*;

public class AssertTest {
	public static void main(String args[]) {
		int a;
		Scanner in = new Scanner(System.in);
		try{
			System.out.print("점수를 입력하세요:");
			a = in.nextInt();
			assert (a < 100 && a >= 0): "올바르지 못한 점수를 입력하셨습니다.";
			System.out.println("올바른 점수를 입력하셨습니다");
		}
		catch(Exception e)
		{
			System.out.println("예외 발생");
		}			
		finally{
			in.close();
		}
	}
}
