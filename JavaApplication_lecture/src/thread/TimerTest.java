package thread;

import java.util.Timer;

public class TimerTest {
	public static void main(String args[]) {
		MyTask task = new MyTask();
		Timer timer = new Timer();
		timer.schedule(task, 1000, 500);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException exc) {
		}
		timer.cancel();
	}
}
