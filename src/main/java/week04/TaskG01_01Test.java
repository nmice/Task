package week04;
/**
 * Created by Mike Neginsky on 15.06.2018.
 */

import util.TestHelper;
import week03.Task12_023;

public class TaskG01_01Test {

    public static void main(String... args) {
        TestHelper.checkAllStrings(TaskG01_01_factorial::main, "10","3628800", "3628800");
    }
}