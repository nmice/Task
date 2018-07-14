package week06.TaskG02_04_ArrayList;

import java.util.Arrays;

public class ArrayListOwnTestDrive {

    public static void main(String[] args) {
        ArrayListOwn arrayListOwn = new ArrayListOwn();
        System.out.println(arrayListOwn.toString());

        arrayListOwn.add("Hello");
        System.out.println(arrayListOwn);

        arrayListOwn.add("World");
        System.out.println(arrayListOwn);

        arrayListOwn.add("!");
        System.out.println(arrayListOwn);

        arrayListOwn.add("!");
        System.out.println(arrayListOwn);

        arrayListOwn.removeElement(3);
        System.out.println(arrayListOwn);

        System.out.println(arrayListOwn.getSize());

        arrayListOwn.clearTheArray();
        System.out.println(arrayListOwn);
    }
}
