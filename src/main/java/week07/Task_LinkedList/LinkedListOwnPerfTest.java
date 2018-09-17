package week07.Task_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListOwnPerfTest {

    public static final int LIST_CAPACITY = 100_000;

    public static void main(String[] args) {
        List<Integer> standart = new LinkedListOwn<>();

        //adding test for standart implementation
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < LIST_CAPACITY; i++) {
            Integer number = (int) (Math.random() * Integer.MAX_VALUE);
            standart.add(number);
        }
        long timeOfAdding = System.currentTimeMillis() - beginTime;
        System.out.println("Time of adding 10M elem in standart PQ is - " + timeOfAdding);

        //adding test for standart implementation
        long beginTime2 = System.currentTimeMillis();
        for (int i = 0; i < LIST_CAPACITY; i++) {
            standart.get(i);
        }
        long timeOfAdding2 = System.currentTimeMillis() - beginTime2;
        System.out.println("Time of getting 10M elem in standart PQ is - " + timeOfAdding2);

    }

    /*public static final int LIST_LENGTH = 50_000;

    public static void main(String[] args) {


        measureTime("Insertion in the midth LinkedList", () -> fillListWithRandomIntegers(new LinkedList()));
        measureTime("Insertion in the midth LinkedListOwn", () -> fillListWithRandomIntegers(new LinkedListOwn()));

        measureTime("Insert at the beginning LinkedList", () -> fillListWithRandomIntegersInBeg(new LinkedList()));
        measureTime("Insert at the beginning LinkedListOwn", () -> fillListWithRandomIntegersInEnd(new LinkedListOwn()));

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
    }*/

}
