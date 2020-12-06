package lambda_stream;

import java.util.function.Consumer;
import java.util.function.Function;

//매개변수가 없고 리턴타입이 없는 메소드를 소유한 인터페이스
interface NoArgNoReturn{
	public void method1();
}

//매개변수가 있고 리턴 타입이 없는 경우 : 원본에 작업을 해서 원본을 변환시키거나 출력하는 인터페이스
interface ArgNoReturn{
	public void method2(int x);
}

//매개변수는 없고 리턴 타입만 있는 경우 : 거의 없는 경우
interface NoArgReturn{
	public double method3();
}

//매개변수가 있고 리턴타입이 있는 경우 - 가장 많은 경우
interface ArgReturn{
	public int method4(String str);
}


public class LambdaMain {

	public static void main(String[] args) {
		//매개변수가 없고 리턴도 없는 인터페이스 활용 
		NoArgNoReturn ob1 = () -> {System.out.println("매개변수가 없고 리턴도 없는 람다");};
		ob1.method1();
		
		//매개변수가 있는 경우 - 매개변수의 자료형은 생략이 가능, 매개변수가 1개인 경우는 ( )로 감싸지 않아도 됩니다.
		ArgNoReturn ob2 = (int x) ->{System.out.println(x + 10);};
		ob2.method2(100);
		
		//매개변수는 없고 리턴만 있는 경우 - 거의 없음
		NoArgReturn ob3 = () ->{return 10.3;};
		double d = ob3.method3();
		System.out.println(d);
		
		//매개변수가 있고 리턴이 있는 경우 - 데이터를 가공해서 리턴하는 함수
		ArgReturn ob4 = (str) ->{return Integer.parseInt(str);};
		int i = ob4.method4("123219");
		System.out.println(i);
	}
}