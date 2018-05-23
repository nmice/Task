package week02;
/**
 * Two integers a and b are given. If a is divisible by b or b is divisible by a,
 * then output 1, otherwise any other number. Conditional Operators and loop operators do not use.
 */

import java.util.Scanner;

public class Task02_043 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a:");
        int a = scanner.nextInt();
        System.out.println("Please input b:");
        int b = scanner.nextInt();
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("If a/b or a/b is integer, result is " + 1 + ": " + divisible(a, b));
    }

    public static int divisible(int a, int b) {
        //int c = (a % b)*(b % a) + 1;
        //return c;
        return (a % b) * (b % a) + 1;
    }
}
