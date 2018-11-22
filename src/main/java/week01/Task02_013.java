package week01;
/**
 * Task02_013 - Given a three-digit number.
 * Find the number obtained by reading its digits from right to left.
 */

import java.util.Scanner;

public class Task02_013 {

    public static void main(String... args) {
        int num = new Scanner(System.in).nextInt();
        System.out.println(invertNum(num)); // call method "printResult" - printing value "num" after method "invert":
    }

    public static int invertNum(int num) {
        int hundred = num / 100;
        int ten = (num - hundred * 100) / 10;
        int digit = num - hundred * 100 - ten * 10;
        int iinvert = digit * 100 + ten * 10 + hundred;
        return iinvert; //in this line of code I changed return "i" to return invert value of "i"
    }
}