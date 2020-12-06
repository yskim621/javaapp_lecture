package operator;

public class Relation
{ 
      public static void main(String[] args) 
      { 
		boolean pan;
		int n = 10;
		float f = 10.0f;
		pan = 10 > 3;
		System.out.println("pan:" + pan);
		pan = 10 == 3;
		System.out.println("pan:" + pan);
		//서로 다른 자료형이지만 숫자 타입이므로 비교가능
		pan = n == f;
		System.out.println("pan:" + pan);
		//자료형이 다르므로 다르다고 리턴
		pan = 0.3f == 0.3;
		System.out.println("pan:" + pan);
	  }
}

