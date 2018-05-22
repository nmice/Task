package week02;

import java.io.*;

public class Task02_043 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input a:");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Please input b:");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("a = " + a + ", b = " + b);
        System.out.println(a%b==0 || b%a==0 ? "1" : "100");
    }
}
