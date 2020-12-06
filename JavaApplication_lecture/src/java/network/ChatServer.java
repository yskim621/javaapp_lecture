package java.network;
import java.net.*;
import java.network.ReceiveThread;
import java.network.SendThread;

public class ChatServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			Thread thread1 = new SendThread(socket);
			Thread thread2 = new ReceiveThread(socket);
			thread1.start();
			thread2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				serverSocket.close();
			} catch (Exception ignored) {
			}
		}
	}
}
