package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallThreadMain {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Future<Integer> f1 = executorService.submit(new CallThread(100));
		Future<Integer> f2 = executorService.submit(new CallThread(20000));
		Future<Integer> f3 = executorService.submit(new CallThread(17800));
		Future<Integer> f4 = executorService.submit(new CallThread(2000));
		Future<Integer> f5 = executorService.submit(new CallThread(12000));
		Future<Integer> f6 = executorService.submit(new CallThread(80));
		try {
			System.out.printf("[%s] 1에서 100까지의 총 합은 %d입니다.%n", "f1", f1.get());
			System.out.printf("[%s] 1에서 20000까지의 총 합은 %d입니다.%n", "f2", f2.get());
			System.out.printf("[%s] 1에서 17800까지의 총 합은 %d입니다.%n", "f3", f3.get());
			System.out.printf("[%s] 1에서 2000까지의 총 합은 %d입니다.%n", "f4", f4.get());
			System.out.printf("[%s] 1에서 12000까지의 총 합은 %d입니다.%n", "f5", f5.get());
			System.out.printf("[%s] 1에서 80까지의 총 합은 %d입니다.%n", "f6", f6.get());
			executorService.shutdown();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
