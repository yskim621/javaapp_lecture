package class_constructor_getter_setter;

public class Student8 {
	private int number;
	static int sequence = 0;
	
	//일련번호 생성을 위한 생성자
	public Student8(){
		number = ++sequence;
	}
	
	//접근자 메소드
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void disp() {
		System.out.println("번호는 " + number + " 입니다.");
	}

}
