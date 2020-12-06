package practice.chap10;

public class Practice2 {

	public static void main(String[] args) {
		String password = "HelloJava12!!!";
		
		int big = 0;
		int small = 0;
		int num = 0;
		int etc = 0;
		
		int len = password.length();
		for(int i=0; i<len; i=i+1) {
			char ch = password.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				big = big + 1;
			}else if(ch >= 'a' && ch <= 'z'){
				small = small + 1;
			}else if(ch >= '0' && ch <= '9') {
				num = num + 1;
			}else {
				etc = etc + 1;
			}
		}
		
		System.out.println("대문자:" + big + "개");
		System.out.println("소문자:" + small + "개");
		System.out.println("숫자:" + num + "개");
		System.out.println("기타문자:" + etc + "개");
		


	}

}
