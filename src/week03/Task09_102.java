package week03;

import java.util.Scanner;

/**
 * Given a word of 15 letters. Rearrange the letters located between the k-th and the s-th
 * letters (that is, with (k + 1) -th in (s-1) -th).
 * The values ​​of k and s are entered from the keyboard, k <s.
 */

public class Task09_102 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word of 15 letters");
        String word = scanner.nextLine();
        System.out.println("Enter number of letter \"k\"");
        int k = scanner.nextInt();
        System.out.println("Enter number of letter \"s\"(s>k)");
        int s = scanner.nextInt();
    }
}
