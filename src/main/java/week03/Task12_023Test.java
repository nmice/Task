package week03;
/**
 * Created by Mike Neginsky on 07.06.2018.
 */

import util.TestHelper;

public class Task12_023Test {

    public static void main(String... args) {
        TestHelper.checkAllStrings(Task12_023::main, "",
                "[1, 0, 0, 0, 0, 0, 1]",
                "[0, 1, 0, 0, 0, 1, 0]",
                "[0, 0, 1, 0, 1, 0, 0]",
                "[0, 0, 0, 1, 0, 0, 0]",
                "[0, 0, 1, 0, 1, 0, 0]",
                "[0, 1, 0, 0, 0, 1, 0]",
                "[1, 0, 0, 0, 0, 0, 1]");
    }
}


//The test did not work!!!