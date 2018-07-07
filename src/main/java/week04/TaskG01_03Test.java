package week04;
/**
 * Created by Mike Neginsky on 17.06.2018.
 */

import util.TestHelper;

public class TaskG01_03Test {

    public static void main(String... args) {
        TestHelper.checkAllStrings(TaskG01_03_bubbleSort::main, "15 1 9 8 1 7 6 5 3 4 5 2 5 6 0 0",
               "Enter a size of array:",
                "Enter 15 numbers - elements of array",
                "Your Array: \r\n[1, 9, 8, 1, 7, 6, 5, 3, 4, 5, 2, 5, 6, 0, 0]",
                "Sort Array: \r\n[0, 0, 1, 1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8, 9]");
    }
}