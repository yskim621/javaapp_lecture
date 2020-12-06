package designpattern_db;

abstract class SmartPhone {
	public abstract void tel();
	public final void call(){
		tel();
	}
}

class Iphone extends SmartPhone {
	@Override
	public void tel() {
		System.out.println("아이폰에서 전화를 겁니다.");
	}
}

class Android extends SmartPhone {
	@Override
	public void tel() {
		System.out.println("안드로이드에서 전화를 겁니다.");
	}
}


public class TemplateMain {
	public static void main(String[] args) {
		SmartPhone phone = new Iphone();
		phone.call();
		
		phone = new Android();
		phone.call();
	}
}
