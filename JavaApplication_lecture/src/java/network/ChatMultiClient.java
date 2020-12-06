package java.network;

import java.io.*;
import java.net.*;

class ChatMultiClient {
	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.print("닉네임을 입력하세요:");
			String nick = in.readLine();
			Socket socket = new Socket("127.0.0.1", 9002);
			Thread thread1 = new ChatSendThread(socket, nick);
			Thread thread2 = new ChatReceiveThread(socket);
			thread1.start();
			thread2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
