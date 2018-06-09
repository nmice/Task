package week03;
/**
 * Remove from the array all the repeating elements, leaving their first occurrences,
 * that is, only the various elements must remain in the array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task11_158 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value of massive elements:");
        int massiveLength = scanner.nextInt();
        int[] mas = new int[massiveLength];
        System.out.println("Enter " + massiveLength + " numbers - elements of massive:");
        int i = 0;
        while (i < massiveLength) {
            mas[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Your Array: " + "\r\n" + Arrays.toString(mas));
        invertMas(mas);

        public static int[] invertMas (int... mas){
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
}