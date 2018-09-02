package week10.quickSort;

import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.sort;
import static org.junit.Assert.*;
import static week10.quickSort.QuickSort.quickSortArray;

public class QuickSortTest {
    private Integer[] testIntArray1 = new Integer[100];
    private Integer[] testIntArray2 = new Integer[100];

    @Before
    public void before() {
        for (Integer elem : testIntArray1) {
            testIntArray1[elem] = Integer.valueOf((int) (Math.random() * 100));
        }
        for (int i = 0; i < 100; i++) {
            testIntArray2[i] = testIntArray1[i];
        }
    }

    @Test
    public void quickSortArrayComparable() {
        sort(testIntArray1);
        assertArrayEquals(testIntArray1, quickSortArray(testIntArray2));
    }

    @Test
    public void quickSortArrayComparator() {

    }
}