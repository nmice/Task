package week04;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Your program should take integer value (n) from keyboard, and print n-th fibonacci number.
 * THere should be two solutions: calculating fibonacci number using iterative solution (using loop), and
 * recursive solution (without loop). Inside of your methods you have to use BigInteger class for storing
 * numbers (since fibonacci values can be huge) Both solution should be covered with unit-tests.
 */

public class TaskG01_02_fibonacci {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //1st solution:
        System.out.println(getFibonacciFromLoop(num));
        //2nd solution:
        System.out.println(getFibonacciFromRecursion(num));
        //3rd solution
//        System.out.println(getFibonacciFromFormula(num));
    }

    public static BigInteger getFibonacciFromLoop(int num) {
        BigInteger f1 = BigInteger.ZERO;
        BigInteger f2 = BigInteger.ONE;
        for (int i = 3; i <= num; i += 2) {
            f1 = f1.add(f2);
            f2 = f2.add(f1);
        }
        if (num % 2 == 0) {
            return f2;
        } else {
            return f1;
        }
    }

    public static BigInteger getFibonacciFromRecursion(int num) {
        if (num == 1) {
            return BigInteger.ZERO;
        }
        if (num == 2) {
            return BigInteger.ONE;
        }
        return getFibonacciFromRecursion(num - 1).add(getFibonacciFromRecursion(num - 2));
    }

/*    private static BigDecimal getFibonacciFromFormula(int num) {

        BigDecimal SQRT5 = sqrt(BigDecimal.valueOf(5), 6);
        BigDecimal PHI = SQRT5.add(BigDecimal.valueOf(1)).divide(BigDecimal.valueOf(2));
        BigDecimal fibonacci = PHI.pow(num).divide((SQRT5.add(BigDecimal.valueOf(0.5))), 1500, HALF_UP);
        fibonacci = fibonacci.setScale(0, HALF_UP);
        return fibonacci;
    }

    public static BigDecimal sqrt(BigDecimal A, final int SCALE) {
        BigDecimal x0 = new BigDecimal("0");
        BigDecimal x1 = new BigDecimal(Math.sqrt(A.doubleValue()));
        BigDecimal TWO = new BigDecimal(2);

        while (!x0.equals(x1)) {
            x0 = x1;
            x1 = A.divide(x0, SCALE, ROUND_HALF_UP);
            x1 = x1.add(x0);
            x1 = x1.divide(TWO, SCALE, ROUND_HALF_UP);

        }
        return x1;
    }*/

}