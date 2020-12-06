package inheritance;

public class StarcraftAbleMain {
	public static void main(String[] args) {
		TerranImpl marine = new TerranImpl();
		marine.attack();
		ProtossImpl dragoon = new ProtossImpl();
		dragoon.attack();
		ZergImpl hydralisk = new ZergImpl();
		hydralisk.attack();
		System.out.println("====객체 형변환과 오버라이딩을 이용====");
		Starcraft obj = new Terran(); // 상위 클래스의 객체에 하위 클래스의 객체를 형변환
		obj.attack();
		obj = new Protoss();
		obj.attack();
		obj = new Zerg();
		obj.attack();
	}
}
