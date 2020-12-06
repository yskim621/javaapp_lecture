package java.lang;

class StringFormat
{
	public static void main(String args[]) 
	{
		String str ;
		float x = 10.7654f;
		float y = 11.74754f;
		str = String.format("%d", 20);
		System.out.println("str = " + str);

		str = String.format("%10d", 20);
		System.out.println("str = " + str);
		
		str = String.format("x:%.1f y:%.1f", x, y);
		System.out.println("str = " + str);
	}
}
