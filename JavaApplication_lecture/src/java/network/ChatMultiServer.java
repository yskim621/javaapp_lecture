package java.network;
import java.net.*;

class ChatMultiServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9002);
            System.out.println("채팅 서버 시작!!!!");
            while (true) {
                Socket socket = serverSocket.accept();
                Thread thread = new ChatPerClientThread(socket);
                thread.start();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}