package com.task;
/* Task02_031 - In a three-digit number, x crossed out its second digit. When to the educated while the double digit number
on the right was assigned the second digit of the number x, the number n was radiated. Given a given n,
find the number x (the value of n is entered from the viatura, 100 ≤ n ≤ 999).*/

import java.io.*;

public class Task02_031 {
    public static void main(String[] args) throws IOException {
        System.out.println("Input n - a three-digit number:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int hundred = n/100;
        int ten = (n-hundred*100)/10;
        int digit = n-hundred*100-ten*10;
        int x = hundred*100+digit*10+ten;
        System.out.println("a-b-c to a-c-b operation:"+x);
    }
}
