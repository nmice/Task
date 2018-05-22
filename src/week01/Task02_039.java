package week01;
/**
 * Task02_039 - Given integers h, m, s (0 <h ≤ 23, 0 ≤ m ≤ 59, 0 ≤ s ≤ 59), indicating the time:
 * "h hours, m minutes, s seconds". Determine the angle (in degrees) between the clockwise position
 * at the beginning of the day and at the specified time.
 */

import java.util.Scanner;

public class Task02_039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        double position = h * 3600 + m * 60 + s;
        if (position > 43200) position = position - 43200;
        System.out.println("position=" + position);
        double degrees = position / 120;
        //if (degrees > 180) {
        //    degrees = 180 - (degrees - 180);
        //}
        System.out.println("degrees=" + degrees);
    }
}