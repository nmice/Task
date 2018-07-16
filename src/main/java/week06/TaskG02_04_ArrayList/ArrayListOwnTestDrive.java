package week06.TaskG02_04_ArrayList;

import java.util.Arrays;
import java.util.function.Consumer;

public class ArrayListOwnTestDrive {

    public static void main(String[] args) {
        ArrayListOwn<Integer> arrayListOwn = new ArrayListOwn<>();

        arrayListOwn.add(123);

        arrayListOwn.add(456);

        Integer firstTwoElements = arrayListOwn.get(0);

//        for (Object o : arrayListOwn) {
//            System.out.println(o);
//        }

        Consumer consumer1 = System.out::println;
        Consumer consumer2 = o -> System.out.println(new StringBuilder(String.valueOf(o)).reverse());
        arrayListOwn.forEach(consumer1.andThen(consumer2));

//        arrayListOwn.add("!");
//        System.out.println(arrayListOwn);
//
//        arrayListOwn.add("!");
//        System.out.println(arrayListOwn);
//
//        arrayListOwn.removeElement(3);
//        System.out.println(arrayListOwn);
//
//        System.out.println(arrayListOwn.getSize());
//
//        arrayListOwn.clearTheArray();
//        System.out.println(arrayListOwn);
    }
}
