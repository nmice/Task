package week06.TaskG02_04_ArrayList;

import java.util.List;
import java.util.function.Consumer;

public class CustomArrayListExample {

    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.add(123);
        customArrayList.add(456);

        Consumer consumer1 = System.out::println;
        Consumer consumer2 = o -> System.out.println(new StringBuilder(String.valueOf(o)).reverse());
        customArrayList.forEach(consumer1.andThen(consumer2));

        customArrayList.add(789);
        System.out.println(customArrayList);

        customArrayList.add(1, 999);
        System.out.println(customArrayList);

        customArrayList.removeElement(2);
        System.out.println(customArrayList);

        System.out.println("Size of your CustomArrayList = " + customArrayList.getSize());

        customArrayList.clearTheArray();
        System.out.println("Clear CustomArrayList: " + customArrayList);

        customArrayList.add(789);
        System.out.println(customArrayList);

        List test = new CustomArrayList();
        test.add("Hi All");
        test.add("!");
        test.add(" three");
        System.out.println(test);
        System.out.println(test.set(1, " two!"));
        System.out.println(test);

        /*  [Hi All, !,  three]
        !
        [Hi All,  two!,  three]*/
    }
}
