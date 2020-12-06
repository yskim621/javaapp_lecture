package thread;

public class MyThread implements Runnable {
	private int i;

	MyThread(int i) {
		this.i = i;
	}

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("나는 Thread:" + i);
	}
}

