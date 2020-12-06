package java.lang;

class StringConvert 
{
	public static void main(String args[]) 
	{
		String st1 = "새 천년 ";
		System.out.println(st1.hashCode());
		String st2 = "대한 민국";
		st1 = st1 + st2;
		System.out.println(st1.hashCode());
		System.out.println(st1);

		StringBuilder sb1 = new StringBuilder("새 천년 ");
		System.out.println(sb1.hashCode());
		sb1.append("대한 민국");
		System.out.println(sb1.hashCode());
		System.out.println(sb1);
	}
}

