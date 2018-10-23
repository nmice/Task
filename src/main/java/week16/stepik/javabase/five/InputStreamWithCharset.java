package week16.stepik.javabase.five;

import week13.stepik.javabasic.two.Char;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class InputStreamWithCharset {
    public static void main(String[] args) {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        BufferedReader reader = new InputStreamReader(inputStream, charset);
        StringBuilder resBuilder = new StringBuilder("");
        String s = reader.re
        while (!(reader.readLine().equals(""))) {
            Charset charFromInput = StandardCharsets.UTF_8;
            resBuilder.append(charFromInput);
        }
        return resBuilder.toString();
// your implementation here

        //Reader reader = new InputStreamReader(inputStream, "UTF-8");

        //Charset charset = StandardCharsets.UTF_8;
        //Writer writer = new OutputStreamWriter(outputStream, charset);
    }
}
