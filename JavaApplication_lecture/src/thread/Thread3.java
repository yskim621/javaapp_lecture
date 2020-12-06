package thread;

public class Thread3
{
	public static void main(String args[]){
		Thread t = new Thread(){
			public void run()
			{
				try{
					System.out.println("데몬 Thread 시작");
					sleep(10000);
					System.out.println("데몬 Thread 종료");			
				}
				catch (Exception e)
				{ }
			}
		};
		//t.setDaemon(true);
		t.start();
		System.out.println("메인 함수 종료");
	}
}


