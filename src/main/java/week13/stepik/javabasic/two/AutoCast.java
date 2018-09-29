package week13.stepik.javabasic.two;

import java.math.*;

public class AutoCast {

        public static void main(String[] args) {
            float a = 1000000000000L;    // long -> float
            int b = '?';                 // char -> int
            Character c = 'b';           // char -> Character
            long d = 1_000_000_000;      // int -> long

            //? char e = 7;
            //String f = 23;
            //int g = true;
            //long h = 1.28F;
        }
}
