package week05;

import org.junit.Assert;
import org.junit.Test;

import static week05.TaskG01_07_Merge_sorted_arrays.mergeSortedArrays;

public class TaskG01_07Test {

    @Test
    public void testMergeSortedArrays() {
//        TaskG01_07_Merge_sorted_arrays task = new TaskG01_07_Merge_sorted_arrays();
        int[] expecteds = {1, 2, 3, 4, 5};
        int[] actuals = mergeSortedArrays(new int[]{1, 2, 5}, new int[]{3, 4});
        Assert.assertArrayEquals("An error has occurred", expecteds, actuals);
    }
}