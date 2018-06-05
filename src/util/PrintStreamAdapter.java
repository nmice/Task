package util;

import java.io.PrintStream;
import java.util.Arrays;

public class PrintStreamAdapter extends PrintStream {
    private String[] outputStringArray;
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

    @Override
    public void println(int x) {
        outputInt = x;
        outputString = String.valueOf(x);
        super.println(x);
    }

    @Override
    public void println(double x) { //constructor 4 dollar-Task
        outputDouble = x;
        outputString = String.valueOf(x);
        super.print(x);
    }

    //@Override
    //public void print(String... x) { //constructor 4 print(String) (Task06_008Test)
    //    outputStringArray = x;
    //    super.print(x);
    //}

    @Override
    public void print(int x) { //constructor 4 print(int) (Task06_008Test)
        outputInt = x;
        outputString = String.valueOf(x);
        super.print(x);
    }

    public PrintStreamAdapter(PrintStream initialOut) {
        super(initialOut);
    }
}