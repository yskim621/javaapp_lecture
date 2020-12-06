package thread;

import java.util.concurrent.RecursiveTask;

//start부터 n까자의 합계를 분할해서 실행하는 클래스
public class PartialTask extends RecursiveTask<Integer> {
	private static final long serialVersionUID = 1L;

	private int n;
	private int start;

	public PartialTask(int start, int n) {
		this.start = start;
		this.n = n;
	}

	private int sum() {
		int result = 0;
		for (int i = start; i <= n; i++) {
			result += i;
		}
		return result;
	}

	@Override
	protected Integer compute() {
		int size = n - start;
		if (size < 10)
			return sum();
		int half = (n + start) / 2;
		PartialTask left = new PartialTask(start, half);
		PartialTask right = new PartialTask(half + 1, n);
		left.fork();
		return right.compute() + left.join();
	}
}
