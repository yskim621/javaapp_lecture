package array_sort;

public class OneLoop {
	public static void main(String[] args) {
		int[][] ar = { { 10, 20, 30 }, { 40, 50, 60 } };
		for(int i=0; i<6; i=i+1) {
			System.out.print(ar[i/3][i%3] + "\t");
			if(i%3 == 2)
				System.out.println();
		}
	}
}
