package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task05_666PrintMultiplyValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String result = "" + n;
        int i = 0;
        //ArrayList<Integer> list = new ArrayList<>();
        ArrayList list = new ArrayList();
        while (2 + 2 == 4) {
            int n = scanner.nextInt();
            //result += " " + n;
            list.add(n);
            if (n == 0) {
                for (Integer num : (List<Integer>)list) {
                    System.out.println(num);
                }
                return;
                //System.exit(1);
                //break;
            }
        }
    }

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String result = "" + n;
        int i = 0;
        int[] nArray = new int[50];
        while (2 + 2 == 4) {
            int n = scanner.nextInt();
            //result += " " + n;
            nArray[i++] = n;
            if (n == 0) {
                for (int j = 0; j < i; j++) {
                    System.out.println(nArray[j]);
                }
                return;
                //System.exit(1);
                //break;
            }
        }
    }*/

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = "" + n;
        while (result.getClass().getSimpleName().equals("String")) {
            n = scanner.nextInt();
            result += " " + n;
            if (n == 0) {
                System.out.println(result);
                //return;
                //System.exit(1);
                //break;
            }
        }
    }*/

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = "" + n;
        while (n != 0) {
            n = scanner.nextInt();
            result += " " + n;
        }
        System.out.println(result);
    }*/
}
