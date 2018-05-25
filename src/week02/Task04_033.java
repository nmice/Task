package week02;
/**
 * Given a natural number.
 * a) Is it true that it ends with an even number?
 * b) Is it true that it ends in an odd number?
 */

import java.util.Scanner;

public class Task04_033 {

    public static void main(String[] args) {
        System.out.println("Please enter natural number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.println("Incorrect number, try again!");
            n = scan.nextInt();
        }
        chek(n);
    }

    public static void chek(int n) {

        if (n % 2 > 0) {
            System.out.println("odd");
        }
        if (n % 2 == 0) {
            System.out.println("even");
        }
    }
}
