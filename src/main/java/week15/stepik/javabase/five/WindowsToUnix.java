package week15.stepik.javabase.five;

import java.io.*;

/*
1) читаем новый байт из потока и запоминаем его в переменную prev
2) если prev не -1, входим в цикл и читаем следующий байт из потока в переменную next, иначе переходим к пункту (6)
3) если prev != 13 или next != 10, выводим prev
4) "передвигаем" очередь путём присвоения prev = next
5) переходим к пункту (2)
6) делаем flush.
*/

public class WindowsToUnix {

    public static void main(String[] args) throws IOException {
        convert(System.in, System.out);
    }

    public static void convert(InputStream inputStream, OutputStream outputStream) throws IOException {
        int prev = inputStream.read();
        int next;
        while (prev != -1) {
            next = inputStream.read();
            if (prev == 13 && next == 10) {
                prev = next;
                continue;
            }
            outputStream.write(prev);
            prev = next;
        }
        outputStream.flush();
    }
}