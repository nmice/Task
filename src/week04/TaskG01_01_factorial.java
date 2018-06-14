package week04;

import java.math.BigInteger;
import java.util.Scanner;

public class TaskG01_01_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(getFactorial(num));
    }

    public static BigInteger getFactorial(int num) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            BigInteger iBig = new BigInteger(String.valueOf(i));
            factorial = factorial.multiply(iBig);
        }
        return factorial;
    }
}
