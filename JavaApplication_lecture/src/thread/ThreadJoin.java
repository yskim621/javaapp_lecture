package thread;

class SumThread extends Thread {	
	private long sum;
	
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	public void run() {
		for(int i=1; i<=100; i++) {
			sum+=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoin {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join(1000);
		} catch (InterruptedException e) {}
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}
