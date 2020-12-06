package java.lang;

import java.math.*;

class NoErrorBigDecimal
{
	public static void main(String[] args)
	{
		double d1 = 1.600000000000000000000;
		double d2 = 0.100000000000000000000;
		System.out.println("두 실수의 덧셈결과: "+ (d1+d2));
		
		BigDecimal e1=new BigDecimal("1.6");
		BigDecimal e2=new BigDecimal("0.1");
		
		System.out.println("두 실수의 덧셈결과: "+ e1.add(e2));
	}
}
