package week03;
/**
 * Given the word. Is it true that it begins and ends with the same letter?
 */

import java.util.Scanner;

public class Task09_017 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String word = scanner.nextLine();
        System.out.println("The word begins and ends with the same letter? " + getMatchLetters(word));
    }

    public static boolean getMatchLetters(String word) {
        boolean sameLetter = false;
        int lastLetter = word.length() - 1;
        sameLetter = word.charAt(0) == word.charAt(lastLetter) ? true : false;
        return sameLetter;
    }
}
