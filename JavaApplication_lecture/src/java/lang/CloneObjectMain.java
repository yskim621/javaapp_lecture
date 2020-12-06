package java.lang;

public class CloneObjectMain {
	public static void main(String[] args) throws Exception {
		CloneObject obj1 = new CloneObject();
		obj1.setNum(10);
		int [] ar = {10,30,50};
		obj1.setAr(ar);
		//주소를 복사
		CloneObject obj2 = obj1;
		//clone을 이용한 복제
		CloneObject obj3 = obj1.clone();
		obj1.setNum(99);
		System.out.println(obj1);
		//주소를 대입한 것이므로 원본의 변화가 영향을 주게 됩니다.
		System.out.println(obj2);
		//복제를 한 것이므로 원본의 변화에 영향이 없습니다.
		System.out.println(obj3);
		System.out.println("=====================================");
		obj1.getAr()[0] = 123;
		System.out.println(obj1);
		//얕은 복제를 한 것이므로 내부 데이터 중에서 참조형의 데이터를 변경하면
		//영향을 미치게 됩니다.
		System.out.println(obj3);
		
	}
}
