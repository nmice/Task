package week05;
/**
 * Created by Mike Neginsky on 23.06.2018.
 */

import util.TestHelper;
import week04.TaskG01_01_factorial;

public class TaskG01_07Test {

    public static void main(String... args) {
        TestHelper.checkAllStrings(TaskG01_07_Merge_sorted_arrays::main, "","New array is 16 elements",
                "[1, 2, 3, 4, 5, 6, 7, 7, 9, 10, 11, 12, 13, 15, 15, 20]");
    }
}