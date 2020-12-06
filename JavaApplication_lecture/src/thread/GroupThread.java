package thread;

public class GroupThread {
	public static void main(String[] args) {
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup group1 = new ThreadGroup("그룹1");
		ThreadGroup group2 = new ThreadGroup("그룹2");

		Thread th1 = new Thread(group1, "Thread1"); 
		Thread th2 = new Thread("Thread2");
		Thread th3 = new Thread(group2, "Thread3");   

		th1.start();
		th2.start();
		th3.start();

		System.out.println("실행 중인 Thread 그룹의 개수: " + main.activeGroupCount());
		System.out.println("실행 중인 Thread 개수: " + main.activeCount());
	}
}
