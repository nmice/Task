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
        printSquareBeforeNum(num);
    }

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
