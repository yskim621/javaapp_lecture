package class_constructor_getter_setter;

public class MethodOverloading {
	public static void main(String[] args) {
		Student6 obj1 = new Student6();
		Student6 obj2 = new Student6();
		obj1.set("조이", 80, 60, 85);
		obj2.setName("제니");
		obj2.set(70, 90, 87);
		obj1.disp();
		obj2.disp();
	}
}
