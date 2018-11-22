package week01;
/**
 * Created by Mike Neginsky on 20.05.2018.
 */

import util.PrintStreamAdapter;

import java.io.ByteArrayInputStream;

public class Task02_031Test {
    public static void main(String... args) {
        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
        System.setOut(printStreamAdapter);
        String data = 123 + "\r\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Task02_031.main();
        String result = printStreamAdapter.getOutputString();
        System.out.println(("a-b-c to a-c-b operation:132").equals(result) ? "OK" : "FAIL");
    }
}