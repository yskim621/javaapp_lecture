package innerclass;

public class  AnonymousInner{
	interface TestInter{
		int data = 10000;
		public void printData();
	}
	public void test(){
		new TestInter(){
			public void printData()//미완성된 것을 완성하여
			{			//JVM이 확인가능하도록 해준다.
				System.out.println("data : "+data);
			}
		}.printData();
	}
	public static void main(String[] args){
		new AnonymousInner().test();
	}
}

