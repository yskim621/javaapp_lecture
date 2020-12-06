package datastructure_variable_format_typecasting;
class CharTest {
	public static void main(String args[]) {
		char ch = 'A';
		System.out.println("ch = " + ch);
		//문자 A에 1을 더해서 출력하므로 66
		System.out.println("ch + 1 = " + (ch + 1));
		//66을 문자 변수에 저장해서 출력하므로 B
		char ch1 = 'A' + 1;
		System.out.println("ch + 1 = " + ch1);
		
		//13은 Enter
		ch = 13;
		System.out.print("ASCII Code 13 = " + ch);
		System.out.print("한 줄이 떨어져서 출력될 것입니다");
	}
}
