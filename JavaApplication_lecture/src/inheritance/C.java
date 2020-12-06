package inheritance;

public class C implements C3 {
	@Override
	public void method1() {
		System.out.println("method1() 메소드의 구현");
	}

	@Override
	public void method2() {
		System.out.println("method2() 메소드의 구현");
	}

	@Override
	public void method3() {
		System.out.println("method3() 메소드의 구현");
	}

	@Override
	public void method4() {
		System.out.println("method4() 메소드의 구현");
	}
}
