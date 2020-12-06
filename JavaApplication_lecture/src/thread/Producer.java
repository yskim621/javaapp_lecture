package thread;

class Producer extends Thread
{
	private Product myW;
	public Producer(Product vec)
	{
		myW=vec;
	}
	public void run()
	{
		for(char ch='A'; ch<='Z'; ch++)
		{
			System.out.println("생산자가 제품"+ch+"을(를) 생산했습니다.");
			myW.put(ch);
		}
	}
}

