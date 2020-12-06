package thread;

public class ShareData implements Runnable {
	private int result;
	private int idx;

	public int getResult() {
		return result;
	}

	private void sum() {
		for (int i = 0; i < 10000; i++) {
			synchronized (this) {
				idx++;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
				}
				result += idx;
			}
		}
	}

	@Override
	public void run() {
		sum();
	}
}
