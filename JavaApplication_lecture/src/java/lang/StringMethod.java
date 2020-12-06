package java.lang;

public class StringMethod {
	public static void main(String[] args) {
		String str1 = "Test" ;
		String str2 = "test";
		System.out.println("str1과 str2 비교 : "  + str1.equals(str2));
		System.out.println("str1와 str2 비교(대소문자 무시) : "  + str1.equalsIgnoreCase(str2));
		String str = " Park Moon Seok ";
		System.out.println(str.trim());
		System.out.println("indexOf(o) = " + str.indexOf('o'));
		System.out.println("lastIndexOf(o) = "  + str.lastIndexOf('o'));
		
		String []  ar = str.split(" ");
		int cnt = ar.length;
		for(int i=0; i<cnt; i++){
			System.out.println(ar[i]);
		}
	}
}