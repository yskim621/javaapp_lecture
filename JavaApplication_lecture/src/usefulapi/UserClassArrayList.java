package usefulapi;

import java.util.ArrayList;

public class UserClassArrayList {
	public static void main(String[] args) {
		ArrayList<Tape> v = new ArrayList<Tape>();
		Tape Obj = new Tape("영웅본색");
		v.add(Obj);
		Obj = new Tape("지존무상");
		v.add(Obj);
		System.out.println(v.get(0));
		System.out.println(v.get(1));
	}
}

