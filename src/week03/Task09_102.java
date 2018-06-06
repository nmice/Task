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
        System.out.println("Enter the word of 15 letters:");
        String word = scanner.nextLine();

        while (word.length() != 15) {
            System.out.println("15 letters, I said...:");
            word = scanner.nextLine();
        }

        System.out.println("Enter number of letter \"k\"");
        int k = scanner.nextInt();

        System.out.println("Enter number of letter \"s\"(s>k)");
        int s = scanner.nextInt();

        System.out.println("Turn the word from \"k\" to \"s\": " + invertLetters(word, k, s));
    }

    public static String invertLetters(String word, int k, int s) {
        String movedSymbol, invertedString = "", result;

        for (int i = s; i - k >= 0; i--) {
            movedSymbol = word.substring(i - 1, i);
            invertedString = invertedString + movedSymbol;
        }

        if (k == 1) {
            result = invertedString + word.substring(s, word.length());
        } else if (s == 15) {
            result = word.substring(0, k - 1) + invertedString;
        } else {
            result = word.substring(0, k - 1) + invertedString + word.substring(s, word.length());
        }

        return result;
    }
}
