package week03;
/**
 * Given the word. Display its k-th symbol.
 */

import java.util.Scanner;

public class Task09_015 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String word = scanner.nextLine();
        System.out.println("Symbol number: ");
        int symbolNumber = scanner.nextInt();
        System.out.println(word.charAt(symbolNumber - 1));
    }
}