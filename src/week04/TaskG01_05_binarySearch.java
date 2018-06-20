package week04;
/**
 * Your program should take several String values from keyboard in sorted order, and (on the new line) take the
 * value to search for. After this the program should print ordinal number of the word. Note: all the values should
 * be placed into Comparable[] array. You are expected to implement two solutions here: linear search and binary search.
 * Both should be covered with unit tests.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskG01_05_binarySearch {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sorted word string:");
        String words = scanner.nextLine();
        Comparable[] array = words.split(" ");
        System.out.println("Your Array: " + "\r\n" + Arrays.toString(array));
        System.out.println("Select Sorted Array: " + "\r\n" + Arrays.toString(sortArrayBySelection(array)));
        array = words.split(" ");
        System.out.println("Bubble Sorted Array: " + "\r\n" + Arrays.toString(sortArrayByBubble(array)));
    }

    public static Comparable[] sortArrayByBubble(Comparable[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 1; i < array.length - j; i++) {
                Comparable a = array[i - 1];
                Comparable b = array[i];
                if (a.compareTo(b) > 0) {
                    array[i] = a;
                    array[i - 1] = b;
                }// end if
            }// end for i
        }//end for j
        return array;
    }//end of method

    public static Comparable[] sortArrayBySelection(Comparable[] array) {
        for (int j = 0; j < array.length-1; j++) {
            for (int i = j + 1; i < array.length; i++) {
                Comparable a = array[j];
                Comparable b = array[i];
                if (a.compareTo(b) > 0) {
                    array[i] = a;
                    array[j] = b;
                }// end if
            }// end for i
        }//end for j
        return array;
    }//end of method

}