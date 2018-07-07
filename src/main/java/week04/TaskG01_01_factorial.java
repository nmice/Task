package week04;
/**
 * Your program should take integer value from keyboard, and print factorial for this number.
 * There should be two solutions: calculating factorial using iterative solution (using loop),
 * and recursive solution (without loop). Inside of your methods you have to use BigInteger class for storing numbers
 * (since factorial values can be huge) Both solution should be covered with unit-tests.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class TaskG01_01_factorial {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //1st solution:
        System.out.println(getFactorialFromLoop(num));
        //2nd solution:
        System.out.println(getFactorialFromRecursion(num));

    }

    public static BigInteger getFactorialFromLoop(int num) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            BigInteger iBig = BigInteger.valueOf(i);
            factorial = factorial.multiply(iBig);
        }
        return factorial;
    }

    public static BigInteger getFactorialFromRecursion(int num) {
        if (num == 1) {
            return BigInteger.valueOf(num);
        }
        BigInteger numBig = new BigInteger(String.valueOf(num));
        BigInteger factorial = getFactorialFromRecursion(num - 1).multiply(numBig);
        return factorial;
    }
}
