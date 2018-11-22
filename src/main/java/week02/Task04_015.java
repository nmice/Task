package week02;
/**
 * The year and the month of the month of birth of a person are known, as well as the year and
 * number of the month of today (January - 1, etc.). Determine the age of a person (the number of full years).
 * In case of coincidence of the indicated numbers of the months, it is considered that a full year has passed.
 */

import java.util.Scanner;
import java.util.Calendar;


public class Task04_015 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your month of birth: ");
        int month = scanner.nextInt();
        System.out.println("Please enter your year of birth: ");
        int year = scanner.nextInt();
        System.out.println("You are " + calcAge(month, year) + " years old");
    }

    public static int calcAge(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        int Month = calendar.get(Calendar.MONTH);
        int Year = calendar.get(Calendar.YEAR);
        System.out.println("Now is " + Month + "." + Year);
        int age = Month >= month ? Year - year : Year - year - 1;
        return age;
    }
}
