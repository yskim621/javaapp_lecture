package exceptionhandling;

public class TryCatch {
	public static void main(String[] args) 
	{
		int[] ar = {10,20,30};
		try
		{
			for(int i=0 ; i <= 3 ; i++)
			{
				System.out.println("ar[" + i + "] : " + ar[i]);	
			}
		}
		catch (Exception e)
		//예외 클래스 이름은 Exception이라고 해도 되고 ArrayIndexOutOfBoundsException 이라고 해도 됩니다.
		{
			System.out.println("예외가 발생했습니다..");	
		}	
	}
}
