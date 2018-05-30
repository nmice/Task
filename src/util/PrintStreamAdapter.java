package util;

import java.io.PrintStream;

public class PrintStreamAdapter extends PrintStream {
    private String outputString;
    private int outputInt;
    private double outputDouble;

    public String getOutputString() {
        return outputString;
    }

    public int getOutputInt() {
        return outputInt;
    }

    public double getOutputDouble() {
        return outputDouble;
    }

    @Override
    public void println(String x) {
        outputString = x;
        super.println(x);
    }

    @Override //construct 4 dollar-Task
    public void println(double x) {
        outputDouble = x;
        outputString = String.valueOf(x);
        super.print(x);
    }

    @Override
    public void println(int x) {
        outputInt = x;
        outputString = String.valueOf(x);
        super.println(x);
    }

    public PrintStreamAdapter(PrintStream initialOut) {
        super(initialOut);
    }
}