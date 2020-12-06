package usefulapi;

import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
		//1-45 사이의 랜덤한 숫자 6개를 저장해서
		//데이터를 정렬한 후 출력
		//중복된 데이터 없이(Set) 
		//숫자를 크기 순서대로 저장(Tree)
		//선택해야 하는 자료구조는 TreeSet
		//TreeSet의 데이터가 6개가 될 때 까지 1-45 사이의
		//숫자를 입력받으면 됩니다.
		TreeSet<Integer>lotto = 
				new TreeSet<Integer>();
		while(lotto.size() != 6){
			lotto.add((int)(Math.random()*100)%45 + 1);
		}
		for(int imsi : lotto)
			System.out.print(imsi + "\t");	
	}
}
