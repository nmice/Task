package week03;
/**
 * Create a program that prints the specified word starting with the last letter.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task09_042 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        String word = scanner.nextLine();
        System.out.println("The word after the last letter is substituted for the beginning: " + getDwor(word));
    }

    public static String getDwor(String word) {
        int length = word.length();
        String dwor = word.substring(length - 1) + word.substring(0, length - 1);
        return dwor;
        //int wordLength = word.length();
        /*char wordChar[] = word.toCharArray();
        int wordLength = word.length();
        char dworChar[] = new char[wordLength-1];
        dworChar[0] = wordChar[wordLength-1];
        for (int i = 1; i < wordLength; i++) {
            dworChar[i] = wordChar[i-1];
        }
        return dworChar;*/
        //char dwor[] = Arrays.copyOf(buf, wordLength+1);
    }
}