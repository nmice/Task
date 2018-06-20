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
        System.out.println("Enter a sorted sequence of words:");
        String words = scanner.nextLine();
        Comparable[] array = words.split(" ");
        Comparable[] array1 = array;
        System.out.println("Enter the search word:");
        String searchWord = scanner.nextLine();
        System.out.println("Your Array: " + "\r\n" + Arrays.toString(array));
        System.out.println(searchWord + " - is the " + linearSearch(array, searchWord) + " word in your Array");
        System.out.println(searchWord + " - is the " + binarySearch(array, searchWord) + " word in your Array");
    }

    public static String linearSearch(Comparable[] array, String searchWord) {
        int num = -1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(searchWord)) {
                num = i + 1;
                break;
            }// end if
        }//end for i1
        String numS = "" + num;
        if (numS.equals("-1")) {
            numS = "Not Found";
        }
        return numS;
    }//end of method

    public static String binarySearch(Comparable[] array, String searchWord) {
        int num = -1;

        int a = array.length;

        //for (int i = 0; i < array.length - 1; i++) {
        if (array[a / 2].compareTo(searchWord) > 0) {
            a = a / 2 - a / 4;
        }// end if
        if (array[a / 2].compareTo(searchWord) < 0) {
            a = a / 2 + a / 4;
        }// end if
        if (array[a / 2].compareTo(searchWord) == 0) {
            num = a;
        }// end if

    String numS = "" + num;
        if(numS.equals("-1"))

    {
        numS = "Not Found";
    }
        return numS;
}//end of method

}