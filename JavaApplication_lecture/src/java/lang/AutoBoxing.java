package java.lang;

class AutoBoxing 
{
	public static void main(String[] args)
	{
		//100은 int 값인데 참조형 변수에 직접 대입
		Integer i = 100;
		//위의 문장은 Integer i = new Integer(100)으로 변환되어 수행됩니다.
		
		System.out.println("i:" + i.intValue());
		//인스턴스를 직접 value 형 변수인 j에 대입
		int j = i;
		//위의 문장은 int j = i.intValue()로 변환되어 수행됩니다.
		System.out.println("j:" + j);
	}
}

