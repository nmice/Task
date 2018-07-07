package week04;
/**
 * Created by Mike Neginsky on 20.06.2018.
 */

import util.TestHelper;

public class TaskG01_05Test {

    public static void main(String... args) {
        TestHelper.checkAllStrings(TaskG01_05_binarySearch::main, "aza baza kaza prokaza sutki_bez_zakaza zaza\r\nprokaza",
                "Enter a sorted sequence of words:",
                                "Enter the search word:",
                                "Your Array: \r\n[aza, baza, kaza, prokaza, sutki_bez_zakaza, zaza]",
                                "prokaza - is the 4 word in your Array",
                                "prokaza - is the 4 word in your Array");
    }
}