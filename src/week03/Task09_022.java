package week03;
/**
 * Given a word consisting of an even number of letters.
 * Display its first half on the screen, without using the loop statement.
 */

import java.util.Scanner;

public class Task09_022 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int halfLength = word.length() / 2;

        String s = "This is a demo of the getChars m9060462352
        char buf[] = new char[halfLength];
        word.getChars(0, halfLength, buf, 0);
        System.out.println(buf);
    }
}
