package week05;

import java.util.Arrays;

public class TaskG01_07_Merge_sorted_arrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 7, 9, 12, 14};
        int[] array2 = {4, 6, 8, 10, 11, 13, 15, 16, 20};
        System.out.println(Arrays.toString(mergeArrays(array1, array2)));
    }

    public static int[] mergeArrays(int array1[], int array2[]) {
        int[] resultArray = new int[array1.length + array2.length];
        System.out.println("New array is " + resultArray.length + " elements");
        int i = 0, j = 0, k;
        for (k = 0; k < resultArray.length; k++) {
            if (array1[i] < array2[j]) {
                resultArray[k] = array1[i];
                System.out.println(k + "-th element is " + array1[i] + " - " + i + "-th element of array1");
                i = i == array1.length - 1 ? i : i + 1;
            } else if (array1[i] > array2[j]) {
                resultArray[k] = array2[j];
                System.out.println(k + "-th element is " + array2[j] + " - " + j + "-th element of array2");
                j = j == array2.length - 1 ? j : j + 1;
            }
        }
        return resultArray;
    }
}