/**
 * Task01_003 - Create a program to display the number entered on the keyboard.
 * The displayed number must be preceded by the message "You entered a number."
 */

import java.io.*;

public class Task01_003 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        printn2(n);
    }

    public static void printn2(int n) {
        System.out.println("You entered a number " + n);
    }
}