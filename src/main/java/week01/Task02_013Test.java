package week01;
/**
 * Created by Mike Neginsky on 20.05.2018.
 */

import util.PrintStreamAdapter;
import util.TestHelper;

import java.io.ByteArrayInputStream;

public class Task02_013Test {

    public static void main(String... args) {
        TestHelper.checkLastString(Task02_013::main, "123", "321");
//        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
//        System.setOut(printStreamAdapter);
//        String data = 123 + "\r\n";
//        System.setIn(new ByteArrayInputStream(data.getBytes()));
//        Task02_031.main(new String[]{});
//        String result = printStreamAdapter.getOutputString();
//        System.out.println(("a-b-c to a-c-b operation:132").equals(result) ? "OK" : "FAIL");
    }
}