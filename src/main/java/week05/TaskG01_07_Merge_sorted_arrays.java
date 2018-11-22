package week05;
/**
 * Merge 2 sorted arrays
 */

import java.util.Arrays;

public class TaskG01_07_Merge_sorted_arrays {

    public static void main(String... args) {
        int[] array1 = {1, 2, 5};
        int[] array2 = {3, 4};
        System.out.println(Arrays.toString(mergeSortedArrays(array1, array2)));
    }

    public static int[] mergeSortedArrays(int array1[], int array2[]) {
        int[] resultArray = new int[array1.length + array2.length];
//        System.out.println("New array is " + resultArray.length + " elements");
        int array1Index = 0;
        int array2Index = 0;
        for (int resultIndex = 0; resultIndex < resultArray.length; resultIndex++) {
            if (array1Index == array1.length && array2Index < array2.length) {
                resultArray[resultIndex] = array2[array2Index++];
            } else if (array1Index < array1.length && array2Index == array2.length) {
                resultArray[resultIndex] = array1[array1Index++];
            } else if (array1[array1Index] < array2[array2Index]) {
                resultArray[resultIndex] = array1[array1Index++];
            } else {
                resultArray[resultIndex] = array2[array2Index++];
            }
        }// end of for
        return resultArray;
    }// end of method
}