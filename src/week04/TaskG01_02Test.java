package week04;
/**
 * Created by Mike Neginsky on 16.06.2018.
 */

import util.TestHelper;

public class TaskG01_02Test {

    public static void main(String... args) {
        TestHelper.checkAllStrings(TaskG01_02_fibonacci::main, "16","610", "610");
    }
}