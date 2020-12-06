package java.network;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sock = null;
		
		try {
			ss = new ServerSocket(9999);
			System.out.println("서버 대기중...");
			while (true) {
				sock = ss.accept();
				System.out.println("접속자 정보 : " + sock.toString());
				BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				String str = in.readLine();
				System.out.println("전송된 내용 : " + str);
				
				PrintWriter pw = new PrintWriter(sock.getOutputStream());
				pw.println("서버가 보내는 메시지");
				pw.flush();
				
				in.close();
				pw.close();
				sock.close();
			}
		}
		catch (IOException e) {
			System.out.println("해당 포트 사용중!!!");
			try {
				ss.close();
			} catch (Exception ex) {
			}
		}
	}
}
