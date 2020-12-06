package thread;

import java.util.concurrent.locks.ReentrantLock;

public class ShareDataEx implements Runnable {
	private int result;
	private int idx;
	static final ReentrantLock sLock = new ReentrantLock(); 
	public int getResult() {
		return result;
	}

	private void sum()  {
		for (int i = 0; i < 10000; i++) {
			sLock.lock();
			idx++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
			result += idx;
			sLock.unlock();
		}
	}
	@Override
	public void run() {
		sum();
	}
}
