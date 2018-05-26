package week02;
/**
 * Create a program that displays the time of the year to which this month refers,
 * depending on the day of the month (1, 2, ..., 12).
 */

import java.util.Scanner;

public class Task04_106 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input number of month (1-12): ");
        int n = scan.nextInt();
        chekMonth(n);
    }

    public static void chekMonth(int n) {
        if (n < 3 || n == 12) {
            System.out.println("Winter");
        } else if (n < 6) {
            System.out.println("Spring");
        } else if (n < 9) {
            System.out.println("Summer");
        } else if (n < 12) {
            System.out.println("Autumn");
        } else {
            System.out.println("Incorrect month-number!");
        }
    }
}
