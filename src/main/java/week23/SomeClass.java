package week23;

import static week23.CustomAnnotation.*;

public class SomeClass {

    @ForStringArguments
    private void print(String text) {
        System.out.println("Text Is " + text);
    }

    private void print(int number) {
        System.out.println("Number Is " + number);
    }
}
