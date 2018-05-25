package week02;
/**
 * The year and the month of the month of birth of a person are known, as well as the year and
 * number of the month of today (January - 1, etc.). Determine the age of a person (the number of full years).
 * In case of coincidence of the indicated numbers of the months, it is considered that a full year has passed.
 */

import java.util.Scanner;
import java.util.Calendar;


public class Task04_015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your month of birth: ");
        int month = scanner.nextInt();
        System.out.println("Please enter your year of birth: ");
        int year = scanner.nextInt();
        calcAge(month, year);
    }

    public static void calcAge(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        //int Date = calendar.get(Calendar.DAY_OF_MONTH);
        int Month = calendar.get(Calendar.MONTH);
        int Year = calendar.get(Calendar.YEAR);
        System.out.println("Now is " + Month + "." + Year);
        int age;
        if (Month >= month) {
            age = Year - year;
        } else {
            age = Year - year - 1;
        }
        System.out.println("You are " + age + " years old");
    }
}
