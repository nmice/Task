package week80;

import java.io.*;
import java.net.Socket;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Handler extends Thread {

    private static final int URL_POSITION_IN_STARTING_LINE = 1;

    private static final String NOT_FOUND_MESAGE = "File not found";

    public static final Map<String, String> CONTENT_TYPES = new HashMap<String, String>() {{
        put("jpg", "image/jpeg");
        put("html", "text/html");
        put("json", "application/json");
        put("txt", "text/plain");
        put("", "text/plain");
    }};

    private Socket socket;

    private String dir;

    public Handler(Socket socket, String dir) {
        this.socket = socket;
        this.dir = dir;
    }

    @Override
    public void run() {
        try (InputStream input = this.socket.getInputStream(); OutputStream out = this.socket.getOutputStream()) {
            String url = this.getRequestUrl(input);
            Path filePath = Paths.get(this.dir, url);
            if (Files.exists(filePath) && !Files.isDirectory(filePath)) {
                // file
                String extension = this.getFileExtension(filePath);
                String type = CONTENT_TYPES.get(extension);
                byte[] fileBytes = Files.readAllBytes(filePath);
                this.sendHeader(out, 200, "OK", type, fileBytes.length);
                out.write(fileBytes);
            } else {
                String type = CONTENT_TYPES.get("text");
                this.sendHeader(out, 404, "Not Found", type, NOT_FOUND_MESAGE.length());
                out.write(NOT_FOUND_MESAGE.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getRequestUrl(InputStream input) {
        Scanner reader = new Scanner(input).useDelimiter("\r\n");
        String line = reader.next();
        String[] requestTextArray = line.split(" ");
        return requestTextArray[URL_POSITION_IN_STARTING_LINE];
    }

    private void sendHeader(OutputStream outputStream, int statusCode, String statusText, String type, long lenght) {
        PrintStream printStream = new PrintStream(outputStream);
        printStream.printf("HTTP/1.1 %s %s%n", statusCode, statusText);
        printStream.printf("Content-Type; %s%n", type);
        printStream.printf("Content-Lenght; %s%n%n", lenght);
    }

    private String getFileExtension(Path path){
        String name = path.getFileName().toString();
        int extensionStart = name.lastIndexOf(".");
        return extensionStart == -1 ? "" : name.substring(extensionStart);
    }
}
