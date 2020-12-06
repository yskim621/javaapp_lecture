package array_sort;

public class VariableArray {
	public static void main(String[] args) {
		int[][] ar = new int[3][];
		int i, j = 0;
		int rowCount, columnCount;
		ar[0] = new int[1];
		ar[1] = new int[2];
		ar[2] = new int[1];
		ar[0][0] = 10;
		ar[1][0] = 20;
		ar[1][1] = 30;
		ar[2][0] = 40;
		rowCount = ar.length;
		for (i = 0; i < rowCount; i++) {
			columnCount = ar[i].length;
			for (j = 0; j < columnCount; j++) {
			System.out.print("ar[" + i + "]" + "[" + j + "]=" + ar[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
