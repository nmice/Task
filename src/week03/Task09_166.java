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
        String newSentence = sentence.trim(); // remove " ".
        String[] wordsArray = newSentence.split("\\s");// create massive of words wo " ".
        int arrSize = wordsArray.length;// calc length of massive wordsArray
        String firstWord = wordsArray[0];// first word in String
        String lastWord = wordsArray[arrSize - 1]; // last word in String
        wordsArray[0] = lastWord; // first element of massive is last word
        wordsArray[arrSize - 1] = firstWord; // last element of massive is first word
        newSentence = String.join(" ", wordsArray); // transform massive to words with " "
        return newSentence;// return string
    }
}
