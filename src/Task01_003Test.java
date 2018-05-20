/**
 * Created by Mike Neginsky on 13.05.2018.
 */

import java.io.InputStream;
import java.io.PrintStream;

public class Task01_003Test {

    public static void main(String[] args) {
        PrintStream initialOut = System.out;
        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(initialOut);

        System.setOut(printStreamAdapter);

        Task01_003.printn2(545);

        String result = printStreamAdapter.getOutputString();
        System.out.println("You entered a number 545".equals(result) ? "OK" : "FAIL");
    }

    public class MyClass {                  // Input Stream Adapter
        private InputStream systemIn;       // Input Stream Adapter

        public MyClass() {                  // Input Stream Adapter
            this(System.in);                // Input Stream Adapter
        }

        public MyClass(InputStream in) {    // Input Stream Adapter
            systemIn = in;                  // Input Stream Adapter
        }
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