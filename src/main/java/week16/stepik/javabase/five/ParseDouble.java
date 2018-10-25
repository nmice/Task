package week16.stepik.javabase.five;
/**
 * Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте вещественных
 * чисел с точностью до шестого знака после запятой. Числом считается последовательность символов, отделенная от окружающего
 * текста пробелами или переводами строк и успешно разбираемая методом Double.parseDouble.
 * На этот раз вам надо написать программу полностью, т.е. объявить класс (с именем Main — таково ограничение проверяющей системы),
 * метод main, прописать все import'ы.
 * <p>
 * Sample Input 1: 1 2 3
 * Sample Output 1: 6.000000
 * <p>
 * Sample Input 2: a1 b2 c3
 * Sample Output 2: 0.000000
 * <p>
 * Sample Input 3: -1e3
 * 18 .111 11bbb
 * Sample Output 3:
 * -981.889000
 */

import java.util.Scanner;

public class ParseDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double num = 0;
        while (scan.hasNext()) {
            if (scan.hasNextDouble()) {
                num = Double.parseDouble(scan.next());
                sum += num;
            } else {
                scan.next();
            }
        }
//        System.out.printf("%.6f", sum);
        String result = String.format("%.6f", sum);
        System.out.println(result);
        return;
    }
}
