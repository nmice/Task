package com.task;
//Task01_003 - Составить программу вывода на экран числа, вводимого с клавиатуры.
// Выводимому числу должно предшествовать сообщение "Вы ввели число".

        import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Вы ввели число " + n);
    }
}
