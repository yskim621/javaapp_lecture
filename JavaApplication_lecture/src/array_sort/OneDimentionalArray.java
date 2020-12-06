package array_sort;

public class OneDimentionalArray {
	public static void main(String[] args) {
		int[] ar = {10, 20, 30, 40, 50, 60};
		int i, j;
		int rowCount = 2;
		int columnCount = 3;
	
		for (i = 0; i < rowCount; i++) {
			for (j = 0; j < columnCount; j++)
				System.out.print("  " + ar[i*columnCount + j]);
			System.out.println();
		}
	}
}
