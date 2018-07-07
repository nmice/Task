package util;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintStreamAdapter extends PrintStream {
    private String outputString;
    private int outputInt;
    private double outputDouble;

    //begin: array of expectedOutput
    private ArrayList<String> outputArrayList = new ArrayList<>();

    public ArrayList<String> getOutputArrayList() {
        return outputArrayList;
    }
    //end: array of expectedOutput

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
        outputArrayList.add(x);
        //ArrayList list = new ArrayList();
        //list.add(x);
        //for (String x : (List<String>) list) {
        //}
        super.println(x);
    }

    @Override
    public void println(int x) {
        outputInt = x;
        outputString = String.valueOf(x);
        outputArrayList.add(String.valueOf(x));
        super.println(x);
    }

    @Override
    public void println(double x) { //constructor 4 dollar-Task
        outputDouble = x;
        outputString = String.valueOf(x);
        outputArrayList.add(String.valueOf(x));
        super.println(x);
    }

    public PrintStreamAdapter(PrintStream initialOut) {
        super(initialOut);
    }
}