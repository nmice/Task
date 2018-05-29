package week02;
/**
 * To print the transfer table 1, 2, ... 20 US dollars into rubles at the
 * current rate (the value of the course is entered from the keyboard).
 */

import java.util.Locale;
import java.util.Scanner;

public class Task05_010 {

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please enter today's course of dollar:");
        double course = scan.nextDouble();
        tableOfCourse(course);
    }

    public static void tableOfCourse(double course) {
        double value;
        for (int i = 1; i < 21; i++) {
            value = course * i;
            System.out.print(i + "$ = " + value + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
