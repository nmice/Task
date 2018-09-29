package week13.stepik.javabasic.two;

public class FlipBit {
    public static void main(String[] args) {
        System.out.println(flipBit(2, 2));
    }

    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1)); // put your implementation here
    }
}
