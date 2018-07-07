package week03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Fill a two-dimensional array with a size of 7 x 7 as shown in the figure.
 */

public class Task12_023 {

    public static void main(String... args) {
        int[][] array = new int[7][7];
        int k, i, j;

        for (k = 0; k <= 6; k++) {
            array[k][k] = 1;
            array[k][6 - k] = 1;
        }
        for (i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        /*for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }*/// Exercise A)
    }
}
