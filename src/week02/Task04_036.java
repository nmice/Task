package week02;
/**
 * The traffic light for pedestrians is programmed as follows: at the beginning of each hour for three
 * minutes a green signal is illuminated, then for two minutes - red, for three minutes - again green, etc.
 * Given a real number t, meaning the time in minutes, elapsed since the beginning of the next hour.
 * Determine the signal of what color is lit for pedestrians at this moment.
 */

import static java.lang.Math.*;

public class Task04_036 {

    public static void main(String[] args) {
        int t = (int) (random() * 100);
        System.out.println("t = " + t + "; Traffic light is " + printcolor(t));
    }

    public static String printcolor(int t) {
        String color;
        if (t % 5 < 3) {
            color = "Green";
        } else {
            color = "Red";
        }
        return color;
    }
}
