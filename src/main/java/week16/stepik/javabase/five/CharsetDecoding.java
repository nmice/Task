package week16.stepik.javabase.five;

import com.sun.imageio.spi.OutputStreamImageOutputStreamSpi;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CharsetDecoding {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String string = "Ы";
        byte[] b = string.getBytes(StandardCharsets.UTF_8);
        System.out.println(b[0] + " " + b[1]);
        System.out.println(256 + b[0] + " " + (256 + b[1]));
        Charset charset = StandardCharsets.UTF_8;
        String string2 = new String(b, charset);
        System.out.println(string2);
        byte[] b2 = {(byte) 208, (byte) 171};
        String string3 = new String(b2, charset);
        System.out.println(string3);
    }
}
