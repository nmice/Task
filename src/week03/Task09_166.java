package week03;
/**
 * Given the sentence. Swap his first and last word.
 */

import java.util.Scanner;

public class Task09_166 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Sentence after swapping of the first and last words: " + swapWords(sentence));
    }

    public static String swapWords(String sentence) {
        String newSentence = sentence.trim(); //remove " "
        String[] wordsArray = newSentence.split("\\s");


        String[] words = newSentence.split("\\s"); //

        //char[] chars = new char[newSentence.length()];// new char massive wo " "
        //newSentence.getChars(0, 5, chars, 0);

        return newSentence;
    }
}
