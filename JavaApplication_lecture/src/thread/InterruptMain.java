package thread;

public class InterruptMain {
	public static void main(String args[]){
		ThreadInterrupt th = new ThreadInterrupt("Thread");
		th.start();
		try{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{}
		th.interrupt();
	}
}
