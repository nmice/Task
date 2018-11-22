package week02;
/**
 * Given an integer k (1 k 365). Determine what will be the k-th day of the year:
 * weekends (Saturday and Sunday) or workers, if January 1 - Monday.
 */

import java.util.Scanner;

import static java.lang.Math.random;

public class Task04_067 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt(); // input the day of the year number
        System.out.println("Day of Year - " + day + ". Is " + calcDayOfWeek(day));
    }

    public static String calcDayOfWeek(int t) {
        String dayOfWeek = (t % 7 > 0 && t % 7 <= 5) ? "Workers" : "Weekends";
        return dayOfWeek;
    }
}