package week01;
/**
 * Created by Mike Neginsky on 13.05.2018.
 */

import java.io.ByteArrayInputStream;
import java.io.PrintStream;

public class Task01_003Test {

    public static void main(String[] args) {
        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
        System.setOut(printStreamAdapter);
        int randomDigit = (int) (Math.random()*100);
        String data = randomDigit+"\r\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Task01_003.main(new String[]{});

        String result = printStreamAdapter.getOutputString();
        System.out.println(("You entered a number " + randomDigit).equals(result) ? "OK" : "FAIL");
    }

    private static class PrintStreamAdapter extends PrintStream {
        private String outputString;

        public String getOutputString() {
            return outputString;
        }

        public void setOutputString(String outputString) {
            this.outputString = outputString;
        }

        @Override
        public void println(String x) {
            outputString = x;
            super.println(x);
        }

        public PrintStreamAdapter(PrintStream initialOut) {
            super(initialOut);
        }
    }
}