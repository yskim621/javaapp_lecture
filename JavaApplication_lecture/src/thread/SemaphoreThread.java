package thread;

import java.util.concurrent.Semaphore;

class SemaphoreThread implements Runnable {
	Semaphore sem;
	String msg;

	SemaphoreThread(Semaphore s, String m) {
	    sem = s;
	    msg = m;
	  }

	public void run() {
		try {
			sem.acquire();
			System.out.println(msg);
			Thread.sleep(10000);
		} catch (Exception exc) {
			System.out.println("예외 발생");
		}
		sem.release();
	}
}
