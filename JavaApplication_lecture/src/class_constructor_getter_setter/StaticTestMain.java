package class_constructor_getter_setter;

class StaticTest
{
	static private String message = "STATIC";
	public static String getString()
	{
		return message; // 여기서 만약 s1을 return하면 오류!
	}
}

public class StaticTestMain
{
	public static void main(String[] args)
	{
		System.out.println("message : "+StaticTest.getString());
	}
}
