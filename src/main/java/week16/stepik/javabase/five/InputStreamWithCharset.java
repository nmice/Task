package week16.stepik.javabase.five;

/**
 * Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 * Пример:
 * InputStream последовательно возвращает четыре байта: 48 49 50 51.
 * Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
 */

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class InputStreamWithCharset {

    public static void main(String[] args) {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder result = new StringBuilder();
        int byteNumber = reader.read();
        while (byteNumber != -1) {
            result = result.append((char) byteNumber);
            byteNumber = reader.read();
        }
        return result.toString();
    }
}
