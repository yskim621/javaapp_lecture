package practice.chap12;

public class ThreadEx extends Thread {
	@Override
	public void run() {
		try {
			for(int i=1; i<= 10; i=i+1) {
				Thread.sleep(1000);
				System.out.printf("%d\n", i);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
