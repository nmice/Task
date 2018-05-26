package week02;
/**
 * Given an integer k (1 k 365). Determine what will be the k-th day of the year:
 * weekends (Saturday and Sunday) or workers, if January 1 - Monday.
 */

import static java.lang.Math.random;

public class Task04_067 {

    public static void main(String[] args) {
        int day = (int) (random() * 365);
        System.out.println("Day of Year - " + day + ". Is " + printDayOfWeek(day));
    }

    public static String printDayOfWeek(int t) {
        String dayofweek;
        if (t % 7 > 0 && t % 7 <= 5) {
            dayofweek = "Workers";
        } else {
            dayofweek = "Weekends";
        }
        return dayofweek;
    }
}