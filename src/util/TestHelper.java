package util;

import java.io.ByteArrayInputStream;

public class TestHelper {
    public static void checkLastString(Runnable task, String mockedInput, String expectedOutput) {
        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
        System.setOut(printStreamAdapter);
        System.setIn(new ByteArrayInputStream(mockedInput.getBytes()));
        task.run();//runs a task
        String result = printStreamAdapter.getOutputString();
        if (expectedOutput.equals(result)) {
            System.out.println("OK");
        } else {
            System.err.println("FAILED, expected: " + expectedOutput + "| actual: " + result);
        }
    }
}