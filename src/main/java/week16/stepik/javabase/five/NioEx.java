package week16.stepik.javabase.five;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Path;

public class NioEx {
    public static void main(String[] args) {
        Path path = null;
        try (ReadableByteChannel inChannel = FileChannel.open(path)) {
        } //catch (NIOException n) {
           // n.printStackTrace(); }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
