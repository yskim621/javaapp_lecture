package thread;

public class Thread1 {
	public static void main(String[] args) {
		// 2개의 스레드를 생성해서 실행
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		t1.start();
		t2.start();
		// t1.run();
		// t2.run();
	}
}
