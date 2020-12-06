package inheritance;

public interface MyInterface {
	//추상 메소드 이므로 하위 클래스에서 재정의 해야 합니다.
	public void method1();
	//추상 메소드가 아니므로 하위 클래스에서 재정의하지 않아도 됩니다.
	public default void method2(){
		System.out.println("default method");
	}
}
