package week02;
/**
 * Write a condition that is true when:
 * a) each of the numbers X and Y is odd;
 * b) only one of the numbers X and Y is less than 20;
 * c) at least one of the numbers X and Y is equal;
 * d) each of the numbers X, Y, Z is negative;
 * e) only one of the numbers X, Y and Z is a multiple of five;
 * f) at least one of the numbers X, Y, Z is greater than 100.
 */

public class Task03_029 {

    public static void main(String[] args) {
        int x = (int) (Math.random() * -100), y = (int) (Math.random() * 150), z = (int) (Math.random() * -100);
        //x and y is a number from 0 to 99
        System.out.println("x=" + x + " y=" + y + " z=" + z);
        exercA(x, y);
        exercB(x, y);
        exercC(x, y);
        exercD(x, y, z);
        exercE(x, y, z);
        exercF(x, y, z);
    }

    public static void exercA(int x, int y) {
        if (x % 2 != 0 && y % 2 != 0) {
            System.out.println("x and y are odd");
        } else {
            System.out.println("x and y are odd - NOT");
        }
    }

    public static void exercB(int x, int y) {
        if (x < 20 && y > 20 || x > 20 && y < 20) {
            System.out.println("only one of the numbers X or Y is less than 20");
        } else {
            System.out.println("only one of the numbers X or Y is less than 20 - NOT");
        }
    }

    public static void exercC(int x, int y) {
        if (x == 0 || y == 0) {
            System.out.println("at least one of the numbers X and Y is zero");
        } else {
            System.out.println("at least one of the numbers X and Y is zero - NOT");
        }
    }

    public static void exercD(int x, int y, int z) {
        if (x < 0 && y < 0 && z < 0) {
            System.out.println("each of the numbers X, Y, Z is negative");
        } else {
            System.out.println("each of the numbers X, Y, Z is negative - NOT");
        }
    }

    public static void exercE(int x, int y, int z) {
        if (x % 5 == 0 && (y % 5) * (z % 5) != 0) {
            System.out.println("only one of the numbers X, Y and Z is a multiple of five");
        } else if (y % 5 == 0 && (x % 5) * (z % 5) != 0) {
            System.out.println("only one of the numbers X, Y and Z is a multiple of five");
        } else if (z % 5 == 0 && (x % 5) * (y % 5) != 0) {
            System.out.println("only one of the numbers X, Y and Z is a multiple of five");
        } else {
            System.out.println("only one of the numbers X, Y and Z is a multiple of five - NOT");
        }
    }

    public static void exercF(int x, int y, int z) {
        if (x > 100 || y > 100 || z > 100) {
            System.out.println("at least one of the numbers X, Y, Z is greater than 100");
        } else {
            System.out.println("at least one of the numbers X, Y, Z is greater than 100 - NOT");
        }
    }
}
