package week06;
/**
 * Created by Mike Neginsky on 12.07.2018.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskG02_02_Merge_sort_iterTest {

    @Test
    public void mergeSortIter() {
        Comparable[] testArray = new Comparable[]{"o", "n", "m", "l", "k", "j", "i", "h", "g", "f", "e", "d", "c", "b", "a"};
        Comparable[] expected = new Comparable[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"};
        Comparable[] actual = TaskG02_02_Merge_sort_iter.mergeSortIter(testArray);
        assertArrayEquals(expected, actual);
    }
}