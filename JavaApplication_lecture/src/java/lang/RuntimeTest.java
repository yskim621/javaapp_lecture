package java.lang;

public class RuntimeTest {
	public static void main(String[] args) {
		try {
			Runtime r1 = Runtime.getRuntime();
			Runtime r2 = Runtime.getRuntime();
			System.out.println("r1의 해시코드:" + r1.hashCode());
			System.out.println("r2의 해시코드:" + r2.hashCode());
			
			//Windows에서 실
			//Runtime.getRuntime().exec("notepad.exe " + "c:\\eula.1028.txt");
			
			//Mac에서 실행 - Mac은 사용 권한 문제로애플리케이션을 직접 열지 못할 수 도 있음
			//Runtime.getRuntime().exec("open /Users/munseokpark/Documents");
			//Runtime.getRuntime().exec("open /System/Applications/TextEdit.app");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}