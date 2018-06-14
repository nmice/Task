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
        System.out.println(getFactorial(num));
        //2nd solution:
        BigInteger factorial = new BigInteger("1");
        printFactorial(factorial, num);

    }

    public static BigInteger getFactorial(int num) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            BigInteger iBig = new BigInteger(String.valueOf(i));
            factorial = factorial.multiply(iBig);
        }
        return factorial;
    }

    public static void printFactorial(BigInteger factorial, int num) {
        if (num == 0) {
            System.out.println(factorial);
        } else {
            BigInteger numBig = new BigInteger(String.valueOf(num));
            factorial = factorial.multiply(numBig);
            num--;
            printFactorial(factorial, num);
        }
    }
}
