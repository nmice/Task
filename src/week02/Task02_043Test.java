package week02;
/**
 * Created by Mike Neginsky on 22.05.2018.
 */


import util.PrintStreamAdapter;

import java.io.ByteArrayInputStream;


public class Task02_043Test {

    public static void main(String[] args) {
        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
        System.setOut(printStreamAdapter);
        String data = 21 + " " + 7;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Task02_043.main(new String[]{});
        String result = printStreamAdapter.getOutputString();
        System.out.println(("If a/b or a/b is integer, result is 1: 1").equals(result) ? "OK" : "FAIL");
    }
}
