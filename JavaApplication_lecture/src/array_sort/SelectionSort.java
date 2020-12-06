package array_sort;

public class SelectionSort {
	public static void main(String[] args) {
		int test[] = { 20, 30, 40, 50, 10 };
		int i, j, temp;
		int cnt = test.length;
		System.out.println("정렬 전");
		for (i = 0; i < cnt; i++) {
			System.out.println((i + 1) + "번째 데이터" + test[i]);
		}
		for (i = 0; i < cnt-1; i++) {
			for (j = i + 1; j < cnt; j++) {
				if (test[i] < test[j]) {
					temp = test[i];
					test[i] = test[j];
					test[j] = temp;
				}
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

