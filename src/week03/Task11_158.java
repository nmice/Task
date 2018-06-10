package week03;
/**
 * Remove from the array all the repeating elements, leaving their first occurrences,
 * that is, only the various elements must remain in the array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task11_158 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value of massive elements:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " numbers - elements of massive:");
        int i = 0;
        while (i < arrayLength) {
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Your Array: " + "\r\n" + Arrays.toString(array));

        //reverse array wo duplicate
        int k = arrayLength - 1;//variable for index of the digit to be checked
        int l = 0;//variable for check digit index
        int newJ = 0;//variable for index of noDuplicate
        int[] reverseArrayWoDuplicate = new int[arrayLength];
        System.out.println("Created a twin-array of Your Array - reverseArrayWoDuplicate");
        boolean noDuplicate = array[k] != array[l];
        while (k > 0) {
            System.out.println(k + "-th element. Check duplicates...");
            for (l = k - 1; l >= 0; l--) {
                if (array[k] == array[l]) {
                    System.out.println(array[k] + " - " + k + "-th element & " + array[l] + " - " + l + "-th element is duplicate");
                    noDuplicate = false;
                    break;
                }
                System.out.println(array[l] + " - " + l + "-th element is no duplicate to " + array[k]);
            }
            if (noDuplicate) {
                reverseArrayWoDuplicate[newJ] = array[k];
                System.out.println(array[k] + " - " + k + "-th element of mas is " + reverseArrayWoDuplicate[newJ] + " - " + newJ + "-th element of masWoDuplicate");
                newJ++;
            }
            k--;
            noDuplicate = true;
        }
        reverseArrayWoDuplicate[newJ] = array[0];
        System.out.println(array[0] + " - 0-th element of mas is " + reverseArrayWoDuplicate[newJ] + " - " + newJ + "-th element of masWoDuplicate");

        //create new Massive wo duplicate true value of elements
        int[] newMas = new int[newJ + 1];
        for (int iter = 0; iter <= newJ; iter++) {
            newMas[iter] = reverseArrayWoDuplicate[iter];
        }
        System.out.println("Reverse Array w/o Duplicate: " + "\r\n" + Arrays.toString(reverseArrayWoDuplicate));

        //invertMas()
        int j, movedElement, invertElement;
        for (j = 0; j < newMas.length / 2; j++) {
            movedElement = newMas[j];
            invertElement = newMas[newMas.length - 1 - j];
            newMas[j] = invertElement;
            newMas[newMas.length - 1 - j] = movedElement;
        }

        //print result array
        System.out.println("Result Array: " + "\r\n" + Arrays.toString(newMas));
    }
}
