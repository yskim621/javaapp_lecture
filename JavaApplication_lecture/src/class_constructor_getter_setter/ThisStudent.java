package class_constructor_getter_setter;

public class ThisStudent {
	public String name;

	public void disp(){
		String name = "배주현";
		System.out.println("지역변수-집에서 사용하는 이름:" + name);
		System.out.println("멤버필드-외부에서 사용하는 이름:" + this.name);
	}
}
