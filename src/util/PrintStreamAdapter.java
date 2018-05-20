package util;

import java.io.PrintStream;

public class PrintStreamAdapter extends PrintStream {
    private String outputString;
    private int outputInt;

    public String getOutputString() {
        return outputString;
    }

    public int getOutputInt() {
        return outputInt;
    }

    @Override
    public void println(String x) {
        outputString = x;
        super.println(x);
    }

    @Override
    public void println(int x) {
        outputInt = x;
        super.println(x);
    }

    public PrintStreamAdapter(PrintStream initialOut) {
        super(initialOut);
    }
}