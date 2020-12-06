package lambda_stream;

import java.util.function.*;

public class OperatorMain {
	public static int max(int[] ar, IntBinaryOperator operator) {
		int result = ar[0];
		for (int score : ar) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] scores = { 92, 95, 87 };
		// 최대값 얻기
		int max = max(scores, (a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("최대값: " + max);

	}
}

