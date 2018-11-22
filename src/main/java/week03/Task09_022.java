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
        System.out.println(getHalfWord(word));
    }

    /*public static char[] getHalfWord(String word) {
        int halfLength = word.length() / 2;
        char result[] = new char[halfLength];
        word.getChars(0, halfLength, buf, 0);
        return result;
    }*/
    public static String getHalfWord(String word) {
        String result = word.substring(0, word.length()/2);
        return result;
    }
}
