package week03.garbage;
/**
 * Remove from the array all the repeating elements, leaving their first occurrences,
 * that is, only the various elements must remain in the array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task11_158M {

    public static void main(String... args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int s;
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Your Array: " + Arrays.toString(array));
        System.out.println("Remove Duplicate: " + Arrays.toString(deleteDuplex(array)));
    }

    private static int[] deleteDuplex(int[] array) {
        int[] resultArray;
        int[] tempArray = new int[array.length];
        int i = 0, ind = 1, k = 0;
        boolean isDuplex = false;

        while (i < array.length) {
            isDuplex = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    ind = j;
                    tempArray[k] = array[j];
                    isDuplex = true;
                }
            }
            if (!isDuplex)
                tempArray[k] = array[i];
            else {
                i = ind;
                isDuplex = false;
            }
            i++;
            k++;
        }

        resultArray = new int[k];

        for (int l = 0; l < k; l++)
            resultArray[l] = tempArray[l];

        return resultArray;
    }
}