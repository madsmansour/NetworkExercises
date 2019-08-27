import java.net.InetSocketAddress;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        URLtoIP ny = new URLtoIP();
        ny.getIP("youtube.com");
        portIsOpen("172.217.168.206", 0, 200);


    }

    public static boolean portIsOpen(String ip, int port, int timeout) {

        for (int i = 0; i < 1025; i++) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(ip, i), timeout);
                socket.close();
                System.out.println("port " + i + " er åben");
//                return true;
            } catch (Exception ex) {
                System.out.println("port " + i + " er lukket");

            }

        }

        return false;
    }

}
