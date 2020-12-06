package array_sort;

public class BubbleSort {
	public static void main(String[] args) {
		int test[] = { 20, 30, 40, 50, 10 };
		int i, j, temp, flag;
		int cnt = test.length;
		System.out.println("정렬 전");
		for (i = 0; i < cnt; i++) {
			System.out.println((i + 1) + "번째 데이터" + test[i]);
		}
		for (i = 0; i < cnt-1; i++) {
			flag = 0;
			for (j = 0; j < cnt - (i+1); j++) {
				if (test[j] < test[j + 1]) {
					temp = test[j];
					test[j] = test[j + 1];
					test[j + 1] = temp;
					flag = 1;
				}
			}
			
			if (flag == 0) {
				break;
			}
		}
		System.out.println("=====================");
		System.out.println("=====================");
		System.out.println("정렬 후");
		for (i = 0; i < cnt; i++) {
			System.out.println((i + 1) + "번째 데이터" + test[i]);
		}
	}
}
