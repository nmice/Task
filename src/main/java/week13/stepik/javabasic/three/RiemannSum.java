package week13.stepik.javabasic.three;

import java.util.function.DoubleUnaryOperator;

public class RiemannSum {
    public static void main(String[] args) {
        DoubleUnaryOperator f = x -> 1;
        System.out.println(integrate(f, 0, 10));
        f = x -> (x / 2 + 7);
        System.out.println(integrate(f, 2, 6));
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double step = Math.pow(10, -6);
        double result = 0;
        double pointNow = a;
        while (pointNow < b) {
            result += (f.applyAsDouble(pointNow)*step);
            pointNow += step;
        }
        return result;
    }
}
