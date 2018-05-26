package week02;

import java.util.Arrays;

public class Task06_666Varargs {

    public static void main(String... args) {
        //String[] strArray = {"1", "2", "3"};
        //printArray(strArray);
        //printArray("1", 2, "hjh", 3.55);
        printArray();
//        printArray(args);
    }

    public static void printArray(Object... args) {
        //System.err.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            System.out.print(i == 0 ? args[i] : ", " + args[i]);
            //System.out.print(i < args.length - 1 ? args[i] + "," : args[i]);
            //System.out.print(args[i]);
            //if (i < args.length - 1) {
            //    System.out.print(", ");
        }
    }
}
