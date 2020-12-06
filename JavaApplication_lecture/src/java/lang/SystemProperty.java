package java.lang;

public class SystemProperty {
	public static void main(String[] args) throws Exception {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String javaHome = System.getProperty("java.home");
		String javaVersion = System.getProperty("java.version");
		
		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈디렉토리: " + userHome);
		System.out.println("자바 디렉토리: " + javaHome);
		System.out.println("자바 버전: " + javaVersion);
		
		String path = System.getenv("path");		
		System.out.println("[ path ]  " + path);
	}
}
