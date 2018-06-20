package week04;
/**
 * Created by Mike Neginsky on 20.06.2018.
 */

import util.TestHelper;

public class TaskG01_05Test {

    public static void main(String... args) {
        TestHelper.checkAllStrings(TaskG01_05_binarySearch::main, "aza baza kaza prokaza sutki_bez_zakaza zaza prokaza",
               "4");
    }
}