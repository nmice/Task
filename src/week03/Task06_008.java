package week03;
/**
 * Given a number n. From the numbers 1, 4, 9, 16, 25, ... print those that do not exceed n.
 * w\o square
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task06_008 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //printSquareSequence(num);//1 solution
        printSquareBeforeNum(num);//2 solution
    }

    /*public static void printSquareSequence(int num) {
        int[] squareSequence = new int[1000];
        int i = 1, j = 1;
        for (int k = 0; k < 1000; k++) {
            squareSequence[k] = i;
            if (squareSequence[k] <= num) {
                System.out.print(squareSequence[k] + " ");
                j += 2;
                i += j;
            } else {
                return;
            }
        }
    }*/

    public static void printSquareBeforeNum(int num) {
        int x = (int) Math.sqrt(num);
        int[] squareArray = new int[x];
        for (int i = 0, j = 1, k = 0; i < x; i++, j += 2) {
            squareArray[i] = k + j;
            k = squareArray[i];
        }
        System.out.println(Arrays.toString(squareArray));
    }
}
