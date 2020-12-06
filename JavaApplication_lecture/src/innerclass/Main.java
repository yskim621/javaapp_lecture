package innerclass;

public class Main {

	public static void main(String[] args) {
		StaticShare obj1 = new StaticShare();
		StaticShare obj2 = new StaticShare();
		obj1.share = "안녕하세요";
		obj1.each = 100;
		
		//share는 static 이므로 obj1이 변경한 내용이 출력
		System.out.println(obj2.share);
		//each는 static이 아니므로 자신의 값 출력
		System.out.println(obj2.each);
	}
}
