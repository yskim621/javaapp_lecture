package thread;

//0.5초 간격으로 스레드 자신의 이름을 10번 출력하는 스레드
public class ThreadTest extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println(getName());
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
