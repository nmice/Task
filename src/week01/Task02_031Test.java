package week01;
/**
 * Task02_031 - In a three-digit number, x crossed out its second digit. When to the educated while the double
 * digit number on the right was assigned the second digit of the number x, the number n was radiated.
 * Given a given n, find the number x (the value of n is entered from the viatura, 100 ≤ n ≤ 999).
 */

import util.PrintStreamAdapter;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02_031Test {
    public static void main(String[] args) {
        PrintStreamAdapter printStreamAdapter = new PrintStreamAdapter(System.out);
        System.setOut(printStreamAdapter);
        String data = 123 + "\r\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Task02_031.main(new String[]{});
        String result = printStreamAdapter.getOutputString();
        System.out.println(("a-b-c to a-c-b operation:132").equals(result) ? "OK" : "FAIL");
    }
}