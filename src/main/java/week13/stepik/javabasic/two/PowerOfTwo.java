package week13.stepik.javabasic.two;

public class PowerOfTwo {
    public static void main(String[] args) {
        for (int i = -2; i < 17; i++) {
            System.out.println("for " + i + " is pow of 2 - is a " + isPowerOfTwo(i));
        }
    }

    public static boolean isPowerOfTwo(int value) {
        return value != 0 && (value == -1 || value == 1 || value % 2 == 0 && isPowerOfTwo(value / 2));
    }
}