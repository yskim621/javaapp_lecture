package lambda_stream;

public class ThreadRambda {
	public static void main(String[] args) {
		Runnable r = ()->{
			try{
				for(int i=0; i<10; i++){
					System.out.println(i);
					Thread.sleep(1000);
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		};
		Thread th = new Thread(r);
		th.start();
	}
}

