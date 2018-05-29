package week02;
/**
 * Created by Mike Neginsky on 29.05.2018.
 */

import util.TestHelper;

public class Task04_036Test {

    public static void main(String[] args) {
        TestHelper.checkLastString(Task04_036::main, "6", "t = 6; Traffic light is Green");
        TestHelper.checkLastString(Task04_036::main, "9", "t = 9; Traffic light is Red");
    }
}
