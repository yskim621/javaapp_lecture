package practice.chap12;

public class Main {

	public static void main(String[] args) {
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		RunnableImpl runnable = new RunnableImpl();
		Thread th2 = new Thread(runnable);
		th2.start();
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					for(int i=1; i<= 10; i=i+1) {
						Thread.sleep(1000);
						System.out.printf("%s\n", "Anonymous Class");
					}
				}catch(Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		};
		Thread th3 = new Thread(r);
		th3.start();
	

	}

}
