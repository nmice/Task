package week03;
/**
 * Created by Mike Neginsky on 03.06.2018.
 */

import util.TestHelper;

public class Task09_015Test {


    public static void main(String... args) {
        String[] s = new String[2];
        s[1] = "javarush";
        s[2] = "3";
        TestHelper.checkLastString(Task09_015::main, "javarush","v"); }
}
//The test did not work!!! Why?