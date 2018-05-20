package week01;

import util.PrintStreamAdapter;

import java.io.ByteArrayInputStream;

/**
 * Task02_039 - Given integers h, m, s (0 <h ≤ 23, 0 ≤ m ≤ 59, 0 ≤ s ≤ 59), indicating the time:
 * "h hours, m minutes, s seconds". Determine the angle (in degrees) between the clockwise position
 * at the beginning of the day and at the specified time.
 */

public class Task02_039Test {
    public static void main(String[] args) {
        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
        System.setOut(printStreamAdapter);
        String data = 21 + " " + 0 + " " + 0 + " ";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Task02_039.main(new String[]{});
        String result = printStreamAdapter.getOutputString();
        System.out.println(("degrees=270.0").equals(result) ? "OK" : "FAIL");
    }
}