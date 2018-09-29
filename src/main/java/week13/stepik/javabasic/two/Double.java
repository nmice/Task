package week13.stepik.javabasic.two;

public class Double {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.2, 0.2, 0.0));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return c - Math.abs(c-(a+b)) < 0.0001;
    }
}
