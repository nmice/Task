package week23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnnotationTD {

    public static void main(String[] args) throws FileNotFoundException {
        String s = "";
        int counter = 0;
        Scanner javaClassText = new Scanner(new File("src/main/java/week23/SomeClass.java"));
        while (javaClassText.hasNext()) {
            s += javaClassText.nextLine() + "\r\n";
        }

        String regex = "(@ForStringArguments)";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            counter++;
        }
        System.out.println("counter = "+counter);
    }
}
