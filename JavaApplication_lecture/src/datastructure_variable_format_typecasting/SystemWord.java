package datastructure_variable_format_typecasting;
public class SystemWord 
{
	public static void main(String args[])
	{
		System.out.println(12 + 017 + 0xb); //12 + 15 + 11
		int i = 020;
		int j = 0xf;
		System.out.println("i=" + i + '\t' + "j=" +j);   // 16 15 
	}
}
