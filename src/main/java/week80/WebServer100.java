package week80;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer100 {

    private int port;

    private String dir;

    public WebServer100(int port, String dir) {
        this.port = port;
        this.dir = dir;
    }

    public void startServer() {
        try (ServerSocket server = new ServerSocket(this.port)) {
            while (true) {
                Socket socket = server.accept();
                Thread thread = new Handler(socket, this.dir);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        String dir = args[1];
        new WebServer100(port, dir).startServer();;
    }
}
