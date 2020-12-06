package array_sort;

public class Matrix {
	public static void main(String[] args) {
		int[][] ar = { { 10, 20, 30 }, { 40, 50, 60 } };
		int i, j;
		int rowCount;
		int columnCount;

		rowCount = ar.length;
		for (i = 0; i < rowCount; i++) {
			columnCount = ar[i].length;
			for (j = 0; j < columnCount; j++)
				System.out.print("  " + ar[i][j]);
			System.out.println();
		}
	}
}
