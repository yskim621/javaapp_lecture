package thread;

public class ProducerConsumerProblem
{
	public static void main(String args[])
	{
		Product Obj=new Product();
		Producer p=new Producer(Obj);
		Customer c=new Customer(Obj);
		
		p.start();
		c.start();
	}
}

