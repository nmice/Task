package week01;
/**
 * Created by Mike Neginsky on 13.05.2018.
 */

import util.PrintStreamAdapter;
import util.TestHelper;
import week02.Task02_043;

import java.io.ByteArrayInputStream;

public class Task01_003Test {

    public static void main(String[] args) {
        TestHelper.checkLastString(Task01_003::main, "525", "You entered a number 525");
//        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
//        System.setOut(printStreamAdapter);
//        int randomDigit = (int) (Math.random() * 100);
//        String data = randomDigit + "\r\n";
//        System.setIn(new ByteArrayInputStream(data.getBytes()));
//        Task01_003.main(new String[]{});
//        String result = printStreamAdapter.getOutputString();
//        System.out.println(("You entered a number " + randomDigit).equals(result) ? "OK" : "FAIL");
    }
}