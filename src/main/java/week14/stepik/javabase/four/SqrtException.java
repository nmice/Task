package week14.stepik.javabase.four;

public class SqrtException {

    public static void main(String[] args) {
        System.err.println(Math.sqrt(13.0));
        System.err.println(Math.sqrt(-5));
        System.err.println(sqrt(13.0));
        System.err.println(sqrt(-5));
    }

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }
}
