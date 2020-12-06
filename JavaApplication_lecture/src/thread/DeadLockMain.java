package thread;

public class DeadLockMain {
	public static void main(String[] args) {
		final DeadLock dl = new DeadLock();
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				while (true)
					dl.instanceMethod1();
			}
		};
		Thread thdA = new Thread(r1);
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				while (true)
					dl.instanceMethod2();
			}
		};
		Thread thdB = new Thread(r2);
		thdA.start();
		thdB.start();
	}
}
