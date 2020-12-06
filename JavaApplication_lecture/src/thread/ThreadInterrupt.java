package thread;

public class ThreadInterrupt extends Thread {
	ThreadInterrupt(String str)
	{
		super(str);
	}
	public void run() 
	{
		try {
			for (int i=0 ; i<10 ; i++) {
				Thread.sleep(1000);
				System.out.println(getName() + i + "번째 수행");
			}
		}
		catch(InterruptedException e) 
		{
			System.out.println("Thread 강제 종료");
			return;
		}
	}
}

