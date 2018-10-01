package week13.stepik.javabasic.two;

public class StartWithTD {
    public static void main(String[] args) {
        String text = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(text.startsWith("Добро пожаловат".concat("ь")));
    }
}
