package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyThreadMain {
	public static void main(String argv[]) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		int i = 0;

		while (!executor.isShutdown()) {
			executor.submit(new MyThread(i++));
			if (i > 10) {
				try {
					executor.shutdown();
					boolean b = executor.awaitTermination(30, TimeUnit.SECONDS);
					System.out.println("남은 작업이 있다면 30초 동안 처리 한 후 종료합니다.");
					System.out.println("b:" + b);
					executor.shutdownNow();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
