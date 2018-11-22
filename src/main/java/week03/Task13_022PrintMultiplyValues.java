package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task13_022PrintMultiplyValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int n = scanner.nextInt();
            list.add(n);
            if (n == 0) {
                for (Integer num : list) {
                    System.out.println(num);
                }
                return;
            }
        }
    }

}
