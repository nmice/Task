package week80;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer90 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        while (true) {
            Socket socket = serverSocket.accept();
            try (PrintWriter out = new PrintWriter(socket.getOutputStream())) {
                out.print("Server");
                try (BufferedReader br = new BufferedReader(new InputStreamReader(
                        new FileInputStream("D://REPOS//Task//src//main//resources//Сервлет(Java).html"), "UTF-8"))) {
                    while ((br.readLine()) != null) {
                        out.print(br.readLine());
                    }
                }
                out.flush();
            }
        }
    }
}
