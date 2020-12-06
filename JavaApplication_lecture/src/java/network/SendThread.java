package java.network;
import java.io.*;
import java.net.*;
import java.util.Scanner;

class SendThread extends Thread {
	Socket socket;

	public SendThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		try {
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			while (true) {
				System.out.print("전송 메시지:");
				String str = scanner.nextLine();
				if (str.equals("bye"))
					break;
				writer.println(str);
				writer.flush();
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				socket.close();
			} catch (Exception e) {
			}
		}
	}
}
