package thread;

class ThreadA extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
}

class ThreadB extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업 내용");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}
}

public class ThreadYield {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();	
		threadA.start();		
		threadB.start();
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = false;
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = true;
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
	}
}


