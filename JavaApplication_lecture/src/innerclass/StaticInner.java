package innerclass;

public class StaticInner {
	int a;
	public static class Inner
	{
		static int g_n;
		static {
			g_n=1;
		}
		public void disp()
		{
			System.out.println("g_n 의 값:" +  g_n);
		}
	}
	
	public static void main(String args[])
	{
		//외부 클래스의 객체 없이도 내부 클래스의 객체 생성 가능
		Inner obj = new Inner();
		obj.disp();
	}
}
