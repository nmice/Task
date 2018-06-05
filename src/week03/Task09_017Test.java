package week03;
/**
 * Created by Mike Neginsky on 03.06.2018.
 */

import util.TestHelper;

public class Task09_017Test {

    public static void main(String... args) {
        TestHelper.checkLastString(Task09_017::main,"angelina", "The word begins and ends with the same letter? true");
        TestHelper.checkLastString(Task09_017::main,"jolie", "The word begins and ends with the same letter? false");
    }
}