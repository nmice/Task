package week14.stepik.javabase.four.robotexeption;

import java.util.Scanner;

public class RobotExeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now is a 30.07.2018");
        System.out.println("How you can give for next Porshe before you take a first java-dev job?");
        int a = scanner.nextInt();
        System.out.println("Ок, in 03.2019 you had your first Java-dev job for 1k$. How you can give for next Porshe in mounth?");
        int b = scanner.nextInt();
        System.out.println("Ок, in 03.2020 you had Job for 2k$/per mounth. How you can give for next Porshe in mounth?");
        int c = scanner.nextInt();
        System.out.println("Ок, in 03.2021 you had Job for 3k$/per mounth. How you can give for next Porshe in mounth?");
        int d = scanner.nextInt();
        System.out.println("Ок. And in 03.2022 you had Job for 4k$/per mounth. How you can give for next Porshe in mounth?");
        int e = scanner.nextInt();
        int sum = a + (b + c + d + e) * 12;
        System.out.println("So, it's " + sum + "$ for you Porshe!");
        System.out.println("And it's " + sum*62 + " rubles on today course! Let's do it! ;)");
    }
}
