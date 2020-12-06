package thread;

public class AutoSaveMain {
	public static void main(String[] args) {
		Thread t = new Thread(new AutoSave());
		t.setDaemon(true);		// 이 부분이 없으면 종료되지 않는다.
		t.start();

		for(int i=1; i <= 20; i++) {
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5)
				AutoSave.autoSave = true;
		}
		System.out.println("프로그램을 종료합니다.");
	}
}

