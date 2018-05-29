package week02;

import java.util.Scanner;

/**
 * To find:
 * a) the sum of all integers from 100 to 500;
 * b) the sum of all integers from a to 500 (the value of a is entered from the keyboard, a <= 500);
 * c) the sum of all integers from -10 to b (the value of b is entered from the string; b> = -10);
 * d) the sum of all integers from a to b (the values ​​of a and b are entered from the keyboard, b> = a).
 */

public class Task05_027 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(getResult(100, 500));//exerciseA
        System.out.println(getResult(a, 500));//exerciseB
        System.out.println(getResult(-10, b));//exerciseC
        System.out.println(getResult(a, b));//exerciseD
    }

    public static int getResult(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += i;
        }
        return result;
    }
}
