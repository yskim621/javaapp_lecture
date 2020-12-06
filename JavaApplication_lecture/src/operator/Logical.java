package operator;

public class Logical
{ 
      public static void main(String[] args) 
      { 
		boolean pan;
		int ten = 10;
		int three = 3;
		pan = ten > three && three < ten;
		System.out.println("pan:" + pan);
		pan = ten > three || ten++ < three;
		System.out.println("pan:" + pan);
		//|| 조건에서 앞의 조건이 true이므로 뒤의 조건은 확인하지 않음
		//ten 과 three의 1증가 작업은 수행되지 않음
		System.out.println("ten:" + ten);
		System.out.println("three:" + three);
	  }
}

