package week02;
/**
 * Create a program that displays the time of the year to which this month refers,
 * depending on the day of the month (1, 2, ..., 12).
 */

import java.util.Scanner;

public class Task04_106 {

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input number of month (1-12): ");
        int monthNumber = scan.nextInt();
        while (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Incorrect number, try again!");
            monthNumber = scan.nextInt();
        }
        System.out.println(monthNumberToMonth(monthNumber));
    }

    public static String monthNumberToMonth(int n) {
        String month;
        if (n < 3 || n == 12) {
            month = "Winter";
        } else if (n < 6) {
            month = ("Spring");
        } else {
            month = n < 9 ? "Summer" : "Autumn";
        }
        return month;
    }
}
