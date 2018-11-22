package week02;
/**
 * The traffic light for pedestrians is programmed as follows: at the beginning of each hour for three
 * minutes a green signal is illuminated, then for two minutes - red, for three minutes - again green, etc.
 * Given a real number t, meaning the time in minutes, elapsed since the beginning of the next hour.
 * Determine the signal of what color is lit for pedestrians at this moment.
 */

import java.util.Scanner;
import static java.lang.Math.*;

public class Task04_036 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt(); // input of traffic light time in minutes
        System.out.println("t = " + t + "; Traffic light is " + (t % 5 < 3 ? "Green" : "Red"));
    }

    //alternative solution
    private static String timeToColor(int t) {
        String color;
        return color = t % 5 < 3 ? "Green" : "Red";
    }
}