package week10.quickSort;

import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.sort;
import static org.junit.Assert.*;
import static week10.quickSort.QuickSort.quickSortArray;

public class QuickSortTest {
    private Integer[] testIntArray1 = new Integer[100];
    private Integer[] testIntArray2 = new Integer[100];
    private String[] testStrArray1 = new String[100];
    private String[] testStrArray2 = new String[100];


    @Before
    public void before() {
        for (int i = 0; i < 100; i++) {
            testIntArray1[i] = (int) (Math.random() * 1000);
        }
        System.arraycopy(testIntArray1, 0, testIntArray2, 0, 100);

        for (int i = 0; i < 100; i++) {
            testStrArray1[i] = Long.toHexString(Double.doubleToLongBits(Math.random()));
        }
        System.arraycopy(testStrArray1, 0, testStrArray2, 0, 100);
    }

    @Test
    public void quickSortArrayComparable() {
        sort(testIntArray1);
        assertArrayEquals(testIntArray1, quickSortArray(testIntArray2));
        sort(testStrArray1);
        assertArrayEquals(testStrArray1, quickSortArray(testStrArray2));
    }

    @Test
    public void quickSortArrayComparator() {
    }
}