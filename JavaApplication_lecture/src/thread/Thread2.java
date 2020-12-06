package thread;

public class Thread2 
{
	public static void main(String args[]) 
	{
		RunnableTest Obj = new RunnableTest();
		// Runnable 인터페이스 객체로 r을 생성
		Thread th = new Thread(Obj);
		// r을 매개 변수로 하여 Thread 객체 th를 생성
		th.start();
    }
}
