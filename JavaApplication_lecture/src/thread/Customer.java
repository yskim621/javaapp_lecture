package thread;

class Customer extends Thread
{
	private Product myW;
	public Customer(Product vec)
	{
		myW = vec;
	}
	public void run()
	{
		char ch;
		for(int i=1; i<=26; i++)
		{
			ch=myW.get();
			System.out.println("소비자가 제품"+ch+"을(를) 소비했습니다.");
		}
	}
}

