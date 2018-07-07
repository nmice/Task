package week04;
/**
 * Created by Mike Neginsky on 20.06.2018.
 */

import util.TestHelper;

public class TaskG01_04Test {

    public static void main(String... args) {
        TestHelper.checkAllStrings(TaskG01_04_sortString::main, "aza zaza baza kaza prokaza sutki_bez_zakaza",
               "Enter the word string:",
                "Your Array: \r\n[aza, zaza, baza, kaza, prokaza, sutki_bez_zakaza]",
                "Select Sorted Array: \r\n[aza, baza, kaza, prokaza, sutki_bez_zakaza, zaza]",
                "Bubble Sorted Array: \r\n[aza, baza, kaza, prokaza, sutki_bez_zakaza, zaza]");
    }
}