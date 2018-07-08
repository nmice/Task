package week06;
/**
 * Merge_sort - Implement iterative solution (i.e. without recursion)
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskG02_02_Merge_sort_iter {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word string:");
        String words = scanner.nextLine();
        Comparable[] array = words.split(" ");
        System.out.println("Your Array: " + "\r\n" + Arrays.toString(array));
        System.out.println("Merge Sort Array: " + "\r\n" + Arrays.toString(mergeSort(array)));
    }

    public static Comparable[] mergeSort(Comparable[] array) {
        if (array.length < 2) {
            return array;
        } else {
            Comparable[] leftHalf = Arrays.copyOfRange(array, 0, array.length / 2);
            Comparable[] rightHalf = Arrays.copyOfRange(array, array.length / 2, array.length);
            return mergeSortedArrays(mergeSort(leftHalf), mergeSort(rightHalf));
        }//end of method
    }//end of method

    public static Comparable[] mergeSortedArrays(Comparable[] array1, Comparable[] array2) {
        Comparable[] resultArray = new Comparable[array1.length + array2.length];
        int array1Index = 0;
        int array2Index = 0;
        for (int resultIndex = 0; resultIndex < resultArray.length; resultIndex++) {
            if (array1Index == array1.length && array2Index < array2.length) {
                resultArray[resultIndex] = array2[array2Index++];
            } else if (array2Index == array2.length && array1Index < array1.length) {
                resultArray[resultIndex] = array1[array1Index++];
            } else if (array1[array1Index].compareTo(array2[array2Index]) < 0) {
                resultArray[resultIndex] = array1[array1Index++];
            } else {
                resultArray[resultIndex] = array2[array2Index++];
            }
        }// end of for
        return resultArray;
    }// end of method
}