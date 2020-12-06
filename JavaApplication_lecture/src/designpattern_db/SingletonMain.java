package designpattern_db;

class OnlyOne {
	static OnlyOne obj = null;
	private OnlyOne(){
	}
	public static OnlyOne getInstance(){
		if(obj==null)
			obj = new OnlyOne();
		return obj;
	}
}

public class SingletonMain{
	public static void main(String[] args) {
		OnlyOne obj1 = OnlyOne.getInstance();
		OnlyOne obj2 = OnlyOne.getInstance();
		
		System.out.println("obj1의 해시코드:" + obj1.hashCode());
		System.out.println("obj2의 해시코드:" + obj2.hashCode());
	}
}