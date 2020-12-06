package class_constructor_getter_setter;

public class ParameterPassing {
	public static void main(String[] args) {
		int a = 10;
		Calculate cal = new Calculate();
		cal.result=10;
		//파라미터로 기본형 데이터를 전송했으므로 변경되지 않습니다.
		cal.inc1(a);
 		System.out.println("a= " + a);
 		//참조형 데이터를 전송했으므로 데이터가 변경 되었을 수 있습니다.
		cal.inc2(cal);
		System.out.println("cal.result= " + cal.result);
	}
}
