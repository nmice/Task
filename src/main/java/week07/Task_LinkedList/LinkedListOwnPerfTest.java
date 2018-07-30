package week07.Task_LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class LinkedListOwnPerfTest {

    public static final int LIST_LENGTH = 50_000;

    public static void main(String[] args) {
        measureTime("Insertion in the midth LinkedList", () -> fillListWithRandomIntegers(new LinkedList()));
        measureTime("Insertion in the midth LinkedListOwn", () -> fillListWithRandomIntegers(new LinkedListOwn()));

        measureTime("Insertion in the beg LinkedList", () -> fillListWithRandomIntegersInBeg(new LinkedList()));
        measureTime("Insertion in the beg LinkedListOwn", () -> fillListWithRandomIntegersInEnd(new LinkedListOwn()));

        measureTime("Insertion in the end LinkedList", () -> fillListWithRandomIntegersInEnd(new LinkedList()));
        measureTime("Insertion in the end LinkedListOwn", () -> fillListWithRandomIntegersInEnd(new LinkedListOwn()));
    }

    private static void fillListWithRandomIntegers(List list) {
        IntStream.generate(() -> (int) ((Math.random() * Integer.MAX_VALUE))).limit(LIST_LENGTH).forEach(a -> list.add(list.size() / 2, a));
    }

    private static void fillListWithRandomIntegersInBeg(List list) {
        IntStream.generate(() -> (int) ((Math.random() * Integer.MAX_VALUE))).limit(LIST_LENGTH).forEach(a -> list.add(0, a));
    }

    private static void fillListWithRandomIntegersInEnd(List list) {
        IntStream.generate(() -> (int) ((Math.random() * Integer.MAX_VALUE))).limit(LIST_LENGTH).forEach(a -> list.add(list.size(), a));
    }


    public static void measureTime(String header, Runnable task) {
        System.out.println(header);
        long before = System.currentTimeMillis();
        task.run();
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
