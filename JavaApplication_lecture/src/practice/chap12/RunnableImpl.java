package practice.chap12;

public class RunnableImpl implements Runnable {
	@Override
	public void run() {
		try {
			for(int i=1; i<= 10; i=i+1) {
				Thread.sleep(1000);
				System.out.printf("%s\n", "Thread Programming");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
