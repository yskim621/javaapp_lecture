package java.lang;

import java.util.Arrays;

public class CloneObject implements Cloneable {
	private int num;
	private int[] ar;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[] getAr() {
		return ar;
	}

	public void setAr(int[] ar) {
		this.ar = ar;
	}

	
	@Override
	// clone 메소드 재정의
	public CloneObject clone() throws CloneNotSupportedException {
		CloneObject temp = new CloneObject();
		temp.num = num;
		// 얕은 복제
		temp.ar = ar;
		return temp;
	}
	
	/*
	@Override
	//clone 메소드 재정의
	public CloneObject clone() throws CloneNotSupportedException{
		CloneObject temp = new CloneObject();
		temp.num = num;
		//얕은 복제
		//temp.ar = ar;
		
		//깊은 복제
		temp.ar = new int[ar.length];
		for(int i=0; i<ar.length; i++){
			temp.ar[i] = ar[i];
		}
        return temp;
    }
	*/

	@Override
	public String toString() {
		return "CloneObject [num=" + num + ", ar=" + Arrays.toString(ar) + "]";
	}

}
