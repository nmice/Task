package week04;
/**
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class TaskG01_04_sortString {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word string:");
        String words = scanner.nextLine();
        String[] array = words.split(" ");
        System.out.println("Your Array: " + "\r\n" + Arrays.toString(array));
        System.out.println("Sorted Array: " + "\r\n" + sortingBySortArrays(array));
        System.out.println("Sorted Array: " + "\r\n" + bubbleSortArrays(array));
        System.out.println("Sorted Array: " + "\r\n" + selectSortArrays(array));
    }

    public static String convertArrayToWords(String[] array) {
        String stringArray = array[0];
        for (int i = 1; i < array.length; i++) {
            stringArray = stringArray + " " + array[i];
        }
        return stringArray;
    }

    public static String sortingBySortArrays(String[] array) {
        //sorting Array:
        Arrays.sort(array);
        //convert Array to String of words:
        String stringArray = array[0];
        for (int i = 1; i < array.length; i++) {
            stringArray = stringArray + " " + array[i];
        }
        return convertArrayToWords(array);
    }

    public static String bubbleSortArrays(String[] array) {
        for (int j = 0; j < array.length - 2; j++) {
            for (int i = 1; i < array.length - j; i++) {
                String a = array[i - 1];
                String b = array[i];
                if (a.compareToIgnoreCase(b) > 0) {
                    array[i] = a;
                    array[i - 1] = b;
                }// end if
            }// end for i
        }//end for j
        return convertArrayToWords(array);
    }//end of method

    public static String selectSortArrays(String[] array) {//TODO!!!
        for (int j = 0; j < array.length - 2; j++) {
            for (int i = 1; i < array.length - j; i++) {
                String a = array[i - 1];
                String b = array[i];
                if (a.compareToIgnoreCase(b) > 0) {
                    array[i] = a;
                    array[i - 1] = b;
                }// end if
            }// end for i
        }//end for j
        return convertArrayToWords(array);
    }//end of method

}