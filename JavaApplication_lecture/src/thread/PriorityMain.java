package thread;

public class PriorityMain
{
	public static void main(String args[])
	{
		ThreadPriority t1 = new ThreadPriority("우선 순위가 낮은 Thread");
		ThreadPriority t2 = new ThreadPriority("우선 순위가 높은 Thread");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
       	t1.start();
		t2.start();
	}
}
