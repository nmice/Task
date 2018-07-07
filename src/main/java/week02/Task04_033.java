package week02;
/**
 * Given a natural number.
 * a) Is it true that it ends with an even number?
 * b) Is it true that it ends in an odd number?
 */

import java.util.Scanner;

public class Task04_033 {

    public static void main(String... args) {
        System.out.println("Please enter natural number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.println("Incorrect number, try again!");
            n = scan.nextInt();
        }
        System.out.println(chekEven(n));
    }

    public static String chekEven(int n) {
        String s = n % 2 == 0 ? "even" : "odd";
        return s;
    }
}
