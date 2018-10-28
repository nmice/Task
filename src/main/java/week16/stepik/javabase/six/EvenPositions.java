package week16.stepik.javabase.six;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами, затем
 * удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в System.out.
 * Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
 * В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.
 * Sample Input:
 * 1 2 3 4 5 6 7
 * Sample Output:
 * 6 4 2
 */

public class EvenPositions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        try {
            s = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("");
            return;
        }
        String[] sArray = s.split(" ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String elem : sArray) {
            arrayList.add(Integer.parseInt(elem));
        }
        StringBuilder result = new StringBuilder();
        for (int index = arrayList.size() - 1; index >= 0; index--) {
            if (index % 2 != 0) {
                result.append(arrayList.get(index));
                result.append(index == 0 ? "" : " ");
            }
        }
        System.out.println(result.toString());
    }
}
