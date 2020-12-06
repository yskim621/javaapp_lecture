package java.lang;

import java.math.*;

public class BigData {

	public static void main(String[] args) {
		BigInteger bint = new BigInteger("100000000000000000000000000");
		BigDecimal bdec = new BigDecimal("0.000195312512345");
		
		int i = bint.intValue();
		float f = bdec.floatValue();
		
		System.out.println("i:" + i);
		System.out.println("bint:" + bint);
		
		System.out.println("f:" + f);
		System.out.println("bdec:" + bdec);
	}
}
