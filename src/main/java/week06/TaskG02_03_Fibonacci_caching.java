package week06;
/**
 * Implement the logic for calculating fibonacci numbers recursively with caching fib values that are already calculated.
 * Use BigInteger array for this purposes.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class TaskG02_03_Fibonacci_caching {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int num = 40;
        long start = System.currentTimeMillis();
        System.out.println(getFibonacciFromRecursion(num, null));
        System.out.println("cache: " + (System.currentTimeMillis() - start));
        long start2 = System.currentTimeMillis();
        System.out.println(getFibonacciFromRecursion(num));
        System.out.println("wo cache:" + (System.currentTimeMillis() - start2));
    }

    public static BigInteger getFibonacciFromRecursion(int num, BigInteger[] cache) {
        if (num == 1) {
            return BigInteger.ZERO;
        }
        if (num == 2) {
            return BigInteger.ONE;
        }
        if (cache == null) {
            cache = new BigInteger[num+1];
        }
        if (cache[num] != null) {
            return cache[num];
        }
        BigInteger fibNsub1;
        if (cache[num - 1] != null) {
            fibNsub1 = cache[num - 1];
        } else {
            cache[num - 1] = getFibonacciFromRecursion(num - 1, cache);
            fibNsub1 = cache[num - 1];
        }
        BigInteger fibNsub2;
        if (cache[num - 2] != null) {
            fibNsub2 = cache[num-2];
        } else {
            cache[num - 2] = getFibonacciFromRecursion(num - 2, cache);
            fibNsub2 = cache[num-2];
        }
        return fibNsub1.add(fibNsub2);
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

}