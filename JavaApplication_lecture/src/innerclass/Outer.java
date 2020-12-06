package innerclass;

public class Outer {
	private int a;

	public Outer() {
		System.out.println("Outer의 생성자");
	}

	public void test() {
		System.out.println("test호출");
	}
	
	public class Inner {
		private int b;
		public Inner() {
			System.out.println("Inner 생성자");
			// 사용 가능 : 이유는 Inner클래스 안에서 Outer의 멤버는 바로 사용 가능
			System.out.println("a:" + a);
			test();
		}
		public void method() {
			System.out.println("Inner의 메서드");
			System.out.println("b:" + b);
		}
	}
	
	public static void main(String args[]) {
		Outer ou = new Outer(); // 결과 : Outer의 생성자
		// ou.method(); //Inner의 메서드를 바로 접근 불가.
		Outer.Inner in = ou.new Inner(); // 결과 : Inner 생성자
		in.method(); // 결과 : Inner의 메서드0
						// 결과 : test호출0
	}
}
