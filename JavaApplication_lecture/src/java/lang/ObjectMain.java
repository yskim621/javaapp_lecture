package java.lang;

public class ObjectMain {

	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass();
		obj1.setNum(10);
		
		ObjectClass obj2 = new ObjectClass();
		obj2.setNum(10);
		
		if(obj1 == obj2){
			System.out.println(
				"2개의 변수가 동일한 인스턴스를 가리키고 있습니다.");
		}
		else{
			System.out.println(
				"2개의 변수가 동일한 인스턴스를 가리키고 있지 않습니다.");
		}

		
		if(obj1.equals(obj2)){
			System.out.println(
				"2개의 변수가 가리키는 인스턴스의 내용이 같습니다.");
		}
		else{
			System.out.println(
				"2개의 변수가 가리키는 인스턴스의 내용이 같지 않습니다.");
		}
	}
}
