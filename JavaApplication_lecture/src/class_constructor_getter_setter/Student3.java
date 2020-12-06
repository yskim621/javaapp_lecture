package class_constructor_getter_setter;

public class Student3 {
	private static String school = "공동체비전고등학교";
	static{
		System.out.println("클래스가 메모리에 로드되었습니다.");
		System.out.println("학교 이름은 " + school + "입니다");
	}
	
	private static String teacher = "이지혜";
	static{
		System.out.println("저의 첫번째 선생님 성함은 " + teacher + "선생님 입니다");
	}
}

