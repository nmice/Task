package week02;

public class Task06_061Varargs {

    public static void main(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(i == 0 ? args[i] : ", " + args[i]);
        }
    }
}
