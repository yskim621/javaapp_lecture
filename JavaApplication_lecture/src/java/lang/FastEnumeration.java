package java.lang;

public class FastEnumeration {
	public static void main(String[] args) {
		int[] ar = { 200, 230, 150, 100, 190 };
		long start, end;
		start = System.nanoTime();
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + "\t");
		System.out.println("");
		end = System.nanoTime();
		System.out.println(end-start);
		
		System.out.println("======================");
		start = System.nanoTime();
		for (int i : ar)
			System.out.print(i + "\t");
		System.out.println("");
		end = System.nanoTime();
		System.out.println(end-start);

	}
}
