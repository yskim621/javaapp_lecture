package datastructure_variable_format_typecasting;
public class Char
{
 	public static void main(String[] args)
 	{
 		//문자 변수를 선언하고 값을 ASCII 코드 값으로 대입
		char ch = 97;
		System.out.println("ch = " + ch);
		
		//문자 리터럴을 직접 대입
		ch = 'a';
		System.out.println("ch = " + ch);
		
		//유니코드를 대입
		ch = '\u0061';
		System.out.println("ch = " + ch);
		
		//제어문자 사용
  		System.out.print("여기는 첫째줄 ");
		System.out.print("입니다.\n"); 
		System.out.println("여기는 둘째 줄 입니다.");
		System.out.print("국어\t영어\t수학\n");
 		System.out.println("---------------------");
		System.out.println("80\t50\t100");
  	}
}

