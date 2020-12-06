package thread;

//0.2초 간격으로 0부터 9까지 출력하는 스레드
class RunnableTest implements Runnable 
{
	public void run() 
	{
		try 
		{
			for (int i=0 ; i<10 ; i++) 
			{
				Thread.sleep(200);
				System.out.println("Thread :" + i);
			}
		}
		catch(InterruptedException e ) 
		{
			e.printStackTrace();
		}
	}
}

