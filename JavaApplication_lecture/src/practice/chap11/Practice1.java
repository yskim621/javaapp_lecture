package practice.chap11;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
	public static void main(String[] args) {
		List<Data> list = new ArrayList<Data>();

		Data data = new Data();
		data.setNum(1);
		data.setName("조이");
		data.setPhone("010");
		data.setAddress("제주");
		list.add(data);

		data = new Data(2, "아이린", "012", "대구");
		list.add(data);
		
		data = new Data(3, "예리", "013", "서울");
		list.add(data);
		System.out.printf("%4s\t%6s\t%10s\t%10s\n", "번호","이름","전화번호","주소");
		for(Data imsi : list) {
			System.out.printf("%4d\t%6s\t%10s\t%10s\n", imsi.getNum(), imsi.getName(), imsi.getPhone(), imsi.getAddress());
		}
	}
}
