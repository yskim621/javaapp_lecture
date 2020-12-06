package designpattern_db;
interface Market {
	public void appStore();
}

class AndroidMarket implements Market {
	@Override
	public void appStore() {
		System.out.println("다양한 마켓 지원");
	}
}

class IphoneMarket implements Market {
	@Override
	public void appStore() {
		System.out.println("단 하나의 마켓");
	}
}
abstract class InternetPhone {
	private Market market;
		
	public void setMarket(Market market) {
		this.market = market;
	}
	
	public abstract void messageWeb();
	public void store(){
		market.appStore();
	}
}
class Apple extends InternetPhone {

	@Override
	public void messageWeb() {
		System.out.println("아이폰은 메시지에 전송된 웹 주소로 바로 이동이 되지 않습니다.");
		System.out.println("보안 문제 때문입니다..");
	}
}

class Google extends InternetPhone {

	@Override
	public void messageWeb() {
		System.out.println("안드로이드 폰은 메시지에 전송된 웹 주소로 바로 이동이 가능합니다.");
		System.out.println("보안에 취약합니다.");
	}
}

public class StrategyMain {
	public static void main(String[] args) {
		Market market1 = new IphoneMarket();
		Market market2 = new AndroidMarket();
		
		InternetPhone android = new Google();
		InternetPhone iPhone = new Apple();
		
		android.setMarket(market1);
		iPhone.setMarket(market2);
		
		android.messageWeb();
		android.store();
		System.out.println("========================");
		iPhone.messageWeb();
		iPhone.store();
	}
}
