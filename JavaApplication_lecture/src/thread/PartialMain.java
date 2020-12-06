package thread;

import java.util.concurrent.ForkJoinPool;

public class PartialMain {
	public static void main(String[] args) {
		PartialTask task = new PartialTask(1, 100);
		ForkJoinPool pool = new ForkJoinPool();
		int r = pool.invoke(task);
		System.out.println(r);
	}
}
