package week06;
/**
 * Merge_sort - Implement iterative solution (i.e. without recursion)
 */

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class TaskG02_02_Merge_sort_iter {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word string:");
        String words = scanner.nextLine();
        Comparable[] array = words.split(" ");
        System.out.println("Your Array: " + "\r\n" + Arrays.toString(array));
        System.out.println("Merge Sort Rec: " + "\r\n" + Arrays.toString(mergeSortRec(array)));
        System.out.println("Merge Sort Iter: " + "\r\n" + Arrays.toString(mergeSortIter(array)));
    }

    public static Comparable[] mergeSortRec(Comparable[] array) {
        if (array.length < 2) {
            return array;
        } else {
            Comparable[] leftHalf = Arrays.copyOfRange(array, 0, array.length / 2);
            Comparable[] rightHalf = Arrays.copyOfRange(array, array.length / 2, array.length);
            return mergeSortedArrays(mergeSortRec(leftHalf), mergeSortRec(rightHalf));
        }//end of method
    }//end of method


    public static Comparable[] mergeSortIter(Comparable[] array) {
        int iter = 1;
        for (int newHalvesLength = 1; newHalvesLength < array.length; newHalvesLength *= 2) {
            for (int newArrayIndex = 0; newArrayIndex < array.length - 1; newArrayIndex += 2 * newHalvesLength) { // 8-й
                if (newArrayIndex + newHalvesLength > array.length) {
                    Comparable[] leftHalf = Arrays.copyOfRange(array, 0, newArrayIndex);
                    Comparable[] tail = Arrays.copyOfRange(array, newArrayIndex, array.length);
                    System.out.println(iter++ + Arrays.toString(mergeSortedArrays(leftHalf, tail)) + "resultTail");
                    return mergeSortedArrays(leftHalf, tail);
                } else {
                    Comparable[] leftHalf = Arrays.copyOfRange(array, newArrayIndex, newArrayIndex + newHalvesLength);
                    if (newArrayIndex + 2 * newHalvesLength > array.length) {
                        Comparable[] tailHalf = Arrays.copyOfRange(array, newArrayIndex + newHalvesLength, array.length);
                        Comparable[] tempArray = mergeSortedArrays(leftHalf, tailHalf);
                        System.arraycopy(tempArray, 0, array, newArrayIndex, tempArray.length);
                        System.out.println(iter++ + Arrays.toString(array) + "tailHalf");
                    } else {
                        Comparable[] rightHalf = Arrays.copyOfRange(array, newArrayIndex + newHalvesLength, newArrayIndex + 2 * newHalvesLength);
                        Comparable[] tempArray = mergeSortedArrays(leftHalf, rightHalf);
                        System.arraycopy(tempArray, 0, array, newArrayIndex, tempArray.length);
                        System.out.println(iter++ + Arrays.toString(array) + "normal");
//              or System.arraycopy(mergeSortedArrays(leftHalf, rightHalf), 0, array, newArrayIndex, leftHalf.length + rightHalf.length);
                    }
                }
            }
        }
        return array;
    }


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