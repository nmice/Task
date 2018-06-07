package week03;
/**
 * Created by Mike Neginsky on 07.06.2018.
 */

import util.TestHelper;

public class Task12_023Test {

    public static void main(String... args) {
        TestHelper.checkLastString(Task11_158::main, "", "1 0 0 0 0 0 1");
        TestHelper.checkLastString(Task11_158::main, "", "0 1 0 0 0 1 0");
        TestHelper.checkLastString(Task11_158::main, "", "0 0 1 0 1 0 0");
        TestHelper.checkLastString(Task11_158::main, "", "0 0 0 1 0 0 0");
        TestHelper.checkLastString(Task11_158::main, "", "0 0 1 0 1 0 0");
        TestHelper.checkLastString(Task11_158::main, "", "0 1 0 0 0 1 0");
        TestHelper.checkLastString(Task11_158::main, "", "1 0 0 0 0 0 1");
    }
}
//The test did not work!!!