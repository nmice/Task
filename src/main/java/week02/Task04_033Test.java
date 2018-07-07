package week02;
/**
 * Created by Mike Neginsky on 29.05.2018.
 */

import util.TestHelper;

public class Task04_033Test {

    public static void main(String... args) {
        TestHelper.checkLastString(Task04_033::main, "26", "even");
        TestHelper.checkLastString(Task04_033::main, "87", "odd");
    }
}
