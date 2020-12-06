package class_constructor_getter_setter;

public class VarArgsTest {
	public void varArg(int... n) {
		for (int i = 0; i < n.length; i++)
			System.out.println("n[" + i + "]:" + n[i]);
		System.out.println("--------------------------");
	}

	public void varArray(int ar[]) {
		for (int i = 0; i < ar.length; i++)
			System.out.println("ar[" + i + "]:" + ar[i]);
		System.out.println("--------------------------");
	}

	public static void main(String[] args) {
		VarArgsTest vt = new VarArgsTest();
		vt.varArg(100, 200);
		vt.varArg(150, 200, 250, 300);
		int ar[] = { 100, 200 };
		vt.varArray(ar);
		int ar1[] = { 150, 200, 250, 300 };
		vt.varArray(ar1);
	}
}
