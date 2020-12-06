package java.network;
import java.io.*;
import java.net.*;
class ChatReceiveThread extends Thread {
    Socket socket;
    ChatReceiveThread(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String str = reader.readLine();
                if (str == null)
                    break;
                System.out.println(str);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
