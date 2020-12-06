package java.lang;

public class ObjectClass {
private int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	//equals 메소드 재정의
	//num의 값이 같으면 동일한 인스턴스로 간주하기 위한 메소드
	public boolean equals(Object aObj){
		if(this.num == ((ObjectClass)aObj).num) 
			return true;
		else	
			return false;
	}
}