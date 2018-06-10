package util;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class TestHelper {
    public static void checkLastString(Runnable task, String mockedInput, String expectedOutput) {
        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
        System.setOut(printStreamAdapter);
        System.setIn(new ByteArrayInputStream(mockedInput.getBytes()));
        task.run();//runs a task

        String result = printStreamAdapter.getOutputString();
        if (expectedOutput.trim().equals(result.trim())) {
            System.out.println("OK");
        } else {
            System.err.println("FAILED, expected: " + expectedOutput + "| actual: " + result);
        }
    }

    public static void checkAllStrings(Runnable task, String mockedInput, String... expectedOutput) {
        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
        System.setOut(printStreamAdapter);
        System.setIn(new ByteArrayInputStream(mockedInput.getBytes()));
        task.run();//runs a task

        ArrayList result = printStreamAdapter.getOutputArrayList();
        if (expectedOutput.equals(result)) {
            System.out.println("OK");
        } else {
            System.err.println("FAILED, expected: " + expectedOutput + "| actual: " + result);
        }
    }
}
