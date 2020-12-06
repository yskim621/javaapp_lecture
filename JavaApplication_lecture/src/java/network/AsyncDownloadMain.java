package java.network;

public class AsyncDownloadMain {
	public static void main(String[] args) {
		ConnectThread mThread = new ConnectThread("https://www.naver.com");
		mThread.start();
	}
}
