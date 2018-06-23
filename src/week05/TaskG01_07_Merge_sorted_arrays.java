package week05;

import java.util.Arrays;

public class TaskG01_07_Merge_sorted_arrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 7, 9, 12, 14};
        int[] array2 = {4, 6, 8, 10, 11, 13, 15, 20};
        System.out.println(Arrays.toString(mergeSortedArrays(array1, array2)));
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{1, 2, 3}, new int[]{})));
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{1, 2, 3}, new int[]{100, 101, 102})));
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{100, 101, 102}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{7, 8, 8}, new int[]{9, 10, 11})));
    }

    public static int[] mergeSortedArrays(int array1[], int array2[]) {
        int[] resultArray = new int[array1.length + array2.length];
        System.out.println("New array is " + resultArray.length + " elements");
        int array1Index = 0;
        int array2Index = 0;
        for (int resultIndex = 0; resultIndex < resultArray.length; resultIndex++) {

            if (array1Index == array1.length && array2Index < array2.length) {
//                System.out.println("array1 is out of elements!");
                resultArray[resultIndex] = array2[array2Index];
//                System.out.println(resultIndex + "-th element is " + array2[array2Index] + " - " + array2Index + "-th element of array2");
                array2Index++;
            }

            if (array1Index < array1.length && array2Index == array2.length) {
//                System.out.println("array2 is out of elements!");
                resultArray[resultIndex] = array1[array1Index];
//                System.out.println(resultIndex + "-th element is " + array2[array2Index] + " - " + array2Index + "-th element of array2");
                array1Index++;
            }

            if (array1Index < array1.length && array2Index < array2.length) {
                if (array1[array1Index] < array2[array2Index]) {
                    resultArray[resultIndex] = array1[array1Index];
//                    System.out.println(resultIndex + "-th element is " + array1[array1Index] + " - " + array1Index + "-th element of array1");
                    array1Index++;
                } else if (array2[array2Index] < array1[array1Index]) {
                    resultArray[resultIndex] = array2[array2Index];
//                    System.out.println(resultIndex + "-th element is " + array2[array2Index] + " - " + array2Index + "-th element of array2");
                    array2Index++;
                } else if (array1[array1Index] == array2[array2Index]) {
                    resultArray[resultIndex] = array1[array1Index];
//                    System.out.println(resultIndex + "-th element is " + array1[array1Index] + " - " + array1Index + "-th element of array1");
                    array1Index++;
                    resultIndex++;
                    resultArray[resultIndex] = array2[array2Index];
//                    System.out.println(resultIndex + "-th element is " + array2[array2Index] + " - " + array2Index + "-th element of array2");
                    array2Index++;
                }
            }

        }
        return resultArray;
    }
}