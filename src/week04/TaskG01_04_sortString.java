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
        System.out.println("Method Sorted Array: " + "\r\n" + sortingBySortArrays(array));
        array = words.split(" ");
        System.out.println("Select Sorted Array: " + "\r\n" + selectSortArrays(array));
        array = words.split(" ");
        System.out.println("Bubble Sorted Array: " + "\r\n" + bubbleSortArrays(array));
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

    public static Comparable[] bubbleSortArrays(Comparable[] array) {
//        int k = 1;
        for (int j = 0; j < array.length - 2; j++) {
            for (int i = 1; i < array.length - j; i++) {
                Comparable a = array[i - 1];
                Comparable b = array[i];
                if (a.compareTo(b) > 0) {
                    array[i] = a;
                    array[i - 1] = b;
//                    System.out.println("swapping...bubble " + k);
//                    k++;
                }// end if
            }// end for i
        }//end for j
        return array;
    }//end of method

    public static String selectSortArrays(String[] array) {//TODO!!!
//        int k=1;
        for (int j = 0; j < array.length-1; j++) {
            for (int i = j + 1; i < array.length; i++) {
                String a = array[j];
                String b = array[i];
                if (a.compareToIgnoreCase(b) > 0) {
                    array[i] = a;
                    array[j] = b;
//                    System.out.println("swapping...select " + k);
//                    k++;
                }// end if
            }// end for i
        }//end for j
        return convertArrayToWords(array);
    }//end of method

}