package thread;

import java.util.concurrent.Callable;

public class CallThread implements Callable<Integer> {
	
	private int total;
	private int n;
	
	public CallThread(int n){
		this.n = n;
	}
	
	public Integer call() throws Exception {
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		Thread.sleep(n);
		return total;
	}
}
