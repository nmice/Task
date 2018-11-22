package util;

import java.io.ByteArrayInputStream;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class TestHelper {

    //The method allows to test console output produced by runnable task execution
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
        ArrayList<String> result = printStreamAdapter.getOutputArrayList();
        String[] resultArray = result.toArray(new String[0]);
        for (int i = 0; i < resultArray.length; i++) {
            if (expectedOutput[i].equals(resultArray[i])) {
                System.out.print("");
            } else {
                System.err.println("FAILED, expected: " + expectedOutput[i] + "| actual: " + resultArray[i]);
                return;
            }
        }
        System.out.println("OK");
    }
}
