import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Merge_sorted_arraysTest {

    @Test
    public void mergeSortedArrays() {
        Merge_sorted_arrays task = new Merge_sorted_arrays();
        int[] array1 = {1, 2, 5};
        int[] array2 = {3, 4};
        Arrays.equals(new int[] {1,2,3,4,5}, task.mergeSortedArrays(array1, array2));
    }
}