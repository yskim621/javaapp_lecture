package java.lang;

class StringCreate 
{
	public static void main(String args[]) 
	{
		char str[] = {'C','o','m','p','u','t','e','r'};
		String s1 = new String(str);
		// 문자배열로부터 문자열 인스턴스 s1 생성
		String s2 = new String(str,3,2);
		// 문자배열로부터 부분 문자열을 추출하여 s2 생성
		String s3 = new String("Java 문자열");
		// 문자열로부터 직접 인스턴스 s3 생성
		String s4 = "Java 문자열";
		String s5 = "Java 문자열";
		
		System.out.println("문자열 s1 : " + s1);
		System.out.println("문자열 s2 : " + s2);
		System.out.println("문자열 s3 : " + s3);
		System.out.println("문자열 s4 : " + s4);
		
		System.out.println("s3의 해시코드:" + System.identityHashCode(s3));
		System.out.println("s4의 해시코드:" + System.identityHashCode(s4));
		System.out.println("s4의 해시코드:" + System.identityHashCode(s5));
	}
}
