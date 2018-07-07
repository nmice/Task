package week05;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TaskG01_07JunitTest {

    @Test
    public void mergeSortedArrays() {
        TaskG01_07_Merge_sorted_arrays task = new TaskG01_07_Merge_sorted_arrays();
        assertEquals(new int[]{1, 2, 3, 4, 5}, task.mergeSortedArrays(new int[]{1, 2, 5}, new int[]{3, 4}));
    }
}