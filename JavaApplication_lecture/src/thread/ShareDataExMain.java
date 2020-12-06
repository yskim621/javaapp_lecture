package thread;

public class ShareDataExMain {
	public static void main(String[] args) {
		ShareData share = new ShareData();
		Thread th1 = new Thread(share);
		Thread th2 = new Thread(share);
		
		th1.start();
		th2.start();
		
		try{
			Thread.sleep(30000);
		}
		catch(Exception e){}
		
		System.out.println("res:" + share.getResult());
	}
}
