package class_constructor_getter_setter;

public class ObjectArray {

	public static void main(String[] args) {
		//배열에 저장할 수 있는 크기만 설정
		Student8 ar[] = new Student8[2];
		
		// 아래 2개의 문장을 호출하지 않으면 가장 아래 문장에서 예외 발생
		//ar[0] = new Student8();
		//ar[1] = new Student8();

		//배열을 생성할 때 생성자를 호출해서 생성
		//Student8 ar[] = { new Student8(), new Student8() };

		ar[0].disp();
		ar[1].disp();
	}
}
