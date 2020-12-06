package java.lang;

public class SampleService {
	@SampleAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}

	@SampleAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}	
	
	@SampleAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}	
}
