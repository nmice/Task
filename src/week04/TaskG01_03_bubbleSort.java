package week04;
/**
 * Your program should take several int values from keyboard and print them in sorted order. All the values
 * should be placed into int[] array. You are expected to implement bubble sorting algorithm for this task.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskG01_03_bubbleSort {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " numbers - elements of array");
        int i = 0;
        while (i < arrayLength) {
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Your Array: " + "\r\n" + Arrays.toString(array));
        System.out.println("Sort Array: " + "\r\n" + Arrays.toString(sortingArrays(array)));
    }

    public static int[] sortingArrays(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 1; i < array.length - j; i++) {
                int a = array[i - 1];
                int b = array[i];
                if (a > b) {
                    array[i] = a;
                    array[i - 1] = b;
                }// end if
            }// end for i
        }//end for j
        return array;
    }//end of method
}