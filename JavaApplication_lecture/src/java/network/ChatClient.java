package java.network;

import java.net.*;

public class ChatClient {
	 public static void main(String[] args) {
	        Socket socket = null;
	        try {
	            socket = new Socket("127.0.0.1", 9001);
	            Thread thread1 = new SendThread(socket);
	            Thread thread2 = new ReceiveThread(socket);
	            thread1.start();
	            thread2.start();
	        }
	        catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
