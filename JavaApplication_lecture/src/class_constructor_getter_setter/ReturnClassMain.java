package class_constructor_getter_setter;

class ReturnClass {
	public void noReturnAdd(int first, int second) {
		System.out.println("합계:" + (first + second));
	}
	
	public int returnAdd(int first, int second) {
		return (first + second);
	}
}

public class ReturnClassMain{
	public static void main(String [] args) {
		ReturnClass obj = new ReturnClass();
		obj.noReturnAdd(100, 200);
		
		int result = obj.returnAdd(100, 200);
		result  = obj.returnAdd(result, 300);
		System.out.println("결과:" + result);
	}
}
