package week13.stepik.javabasic.two;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(value);
        while (value > 1) {
            result = result.multiply(BigInteger.valueOf(value---1));
        }
        return result; // your implementation here
    }
}
