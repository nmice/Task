package week06;

public class DefineMaxInt {
    public static void main(String[] args) {
        System.out.println(0b01111111_11111111_11111111_11111111);
        int maxInt = 0;
        while (true) {
            if (maxInt + 1 > maxInt) {
                maxInt++;
            } else {
                System.out.println("maxInt = " + maxInt);
                System.out.println("minInt = " + (maxInt + 1));
                break;
            }
        }
        System.out.println(log(2, Byte.MAX_VALUE));
        System.out.println(Math.pow(2,31));
    }

    private static double log(int base, long num) {
        int result = 0;
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        if (num == 0) {
            return -1 / 0.;
        }
        while (num / 2 > 0) {
            num = num / 2;
            result++;
        }
        return result;
    }
}
/*
2; 10;
1; 1;
3; 11;
16; 10000;
32; 100000;
31; 011111;
2^32; 1 00000000 00000000 00000000 00000000;
2^31;   10000000 00000000 00000000 00000000;
2^31-1; 01111111 11111111 11111111 11111111;
 */