package week15.stepik.javabase.five;

import java.io.File;
import java.io.IOException;

public class PathToFile {
    public static void main(String[] args) throws IOException {
        String one = "a\\b\\..\\file.txt";
        String two = ".\\a\\b\\..\\b\\c\\.\\file.txt";
        String three = "a\\.\\b\\..\\c\\.\\file.txt";
        String four = "a\\b\\c\\file.txt";
        String five = "a\\..\\b\\c\\file.txt";
        String[] paths = {one, two, three, four, five};

        for (String path:paths) {
            File file = new File(path);
            System.out.println(file.getCanonicalPath());
        }
    }
}
