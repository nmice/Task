package week05;
/**
 * Created by Mike Neginsky on 29.06.2018.
 */

import util.TestHelper;

public class TaskG01_08Test {

    public static void main(String... args) {
        TestHelper.checkAllStrings(TaskG01_08_Merge_sort::main, "a h j c f k d e b g i",
                "Enter the word string:",
                "Your Array: \r\n[a, h, j, c, f, k, d, e, b, g, i]",
                "Merge Sort Array: \r\n[a, b, c, d, e, f, g, h, i, j, k]");
        TestHelper.checkAllStrings(TaskG01_08_Merge_sort::main, "\r\n",
                "Enter the word string:",
                "Your Array: \r\n[]",
                "Merge Sort Array: \r\n[]");
        TestHelper.checkAllStrings(TaskG01_08_Merge_sort::main, "ali-baba",
                "Enter the word string:",
                "Your Array: \r\n[ali-baba]",
                "Merge Sort Array: \r\n[ali-baba]");
        TestHelper.checkAllStrings(TaskG01_08_Merge_sort::main, "baba ali",
                "Enter the word string:",
                "Your Array: \r\n[baba, ali]",
                "Merge Sort Array: \r\n[ali, baba]");
        TestHelper.checkAllStrings(TaskG01_08_Merge_sort::main, "as same as same for same for three or threes or tree",
                "Enter the word string:",
                "Your Array: \r\n[as, same, as, same, for, same, for, three, or, threes, or, tree]",
                "Merge Sort Array: \r\n[as, as, for, for, or, or, same, same, same, three, threes, tree]");

    }
}