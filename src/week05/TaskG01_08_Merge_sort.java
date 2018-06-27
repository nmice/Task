package week05;
/**
 * Your program should take several String values from keyboard and print them in sorted order.
 * All the values should be placed into Comparable[] array. You are expected to implement two
 * solutions here: bubble sorting algorithm, and selection sorting algorithm.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskG01_08_Merge_sort {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word string:");
        String words = scanner.nextLine();
        Comparable[] array = words.split(" ");
        System.out.println("Your Array: " + "\r\n" + Arrays.toString(array));
        System.out.println("Merge Sort Array: " + "\r\n" + Arrays.toString(mergeSort(array)));
    }

    public static Comparable[] mergeSort(Comparable[] array) {
        // Поступил несортированный массив
        // Рекурсия - поделили надвое
        щ

        // Объединили
        return array;
    }//end of method

    public static int[] mergeSortedArrays(int array1[], int array2[]) {
        int[] resultArray = new int[array1.length + array2.length];
        System.out.println("New array is " + resultArray.length + " elements");
        int array1Index = 0;
        int array2Index = 0;
        for (int resultIndex = 0; resultIndex < resultArray.length; resultIndex++) {
            if (array1Index == array1.length && array2Index < array2.length) {
                resultArray[resultIndex] = array2[array2Index];
                array2Index++;
            } else if (array1Index < array1.length && array2Index == array2.length) {
                resultArray[resultIndex] = array1[array1Index];
                array1Index++;
            } else if (array1Index < array1.length && array2Index < array2.length && array1[array1Index] < array2[array2Index]) {
                resultArray[resultIndex] = array1[array1Index];
                array1Index++;
            } else {
                resultArray[resultIndex] = array2[array2Index];
                array2Index++;
            }
        }// end of for
        return resultArray;
    }// end of method

}