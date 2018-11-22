package week01;
/**
 * Created by Mike Neginsky on 20.05.2018.
 */

import util.PrintStreamAdapter;
import java.io.ByteArrayInputStream;

public class Task02_039Test {
    public static void main(String... args) {
        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
        System.setOut(printStreamAdapter);
        String data = 21 + " " + 0 + " " + 0 + " ";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Task02_039.main();
        String result = printStreamAdapter.getOutputString();
        System.out.println(("degrees=270.0").equals(result) ? "OK" : "FAIL");
    }
}