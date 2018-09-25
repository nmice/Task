package week11.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorQueuePerfTest {
    public static int CAPACITY_OF_QUEUE = 8_000;

    public static void main(String[] args) {
        Queue<Integer> standart = new PriorityQueue<>();
        Queue<Integer> my = new PriorQueueOwn<>();

        //adding test for standart implementation
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY_OF_QUEUE; i++) {
            Integer number = (int) (Math.random() * Integer.MAX_VALUE);
            standart.add(number);
        }
        long timeOfAdding = System.currentTimeMillis() - beginTime;
        System.out.println("Time of adding " + CAPACITY_OF_QUEUE + " elem in standart PQ is - " + timeOfAdding);

        //adding test for my implementation
        long newBeginTime = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY_OF_QUEUE; i++) {
            Integer number = (int) (Math.random() * Integer.MAX_VALUE);
            my.add(number);
        }
        long newTimeOfAdding = System.currentTimeMillis() - newBeginTime;
        System.out.println("Time of adding " + CAPACITY_OF_QUEUE + " elem in my PQ is - " + newTimeOfAdding);


        //removing test for standart implementation
        long beginTime2 = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY_OF_QUEUE; i++) {
            standart.remove();
        }
        long timeOfRemoving2 = System.currentTimeMillis() - beginTime2;
        System.out.println("Time of removing " + CAPACITY_OF_QUEUE + " elem in standart PQ is - " + timeOfRemoving2);

        //removing test for my implementation
        long newBeginTime2 = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY_OF_QUEUE; i++) {
            my.remove();
        }
        long newTimeOfRemoving2 = System.currentTimeMillis() - newBeginTime2;
        System.out.println("Time of removing " + CAPACITY_OF_QUEUE + " elem in my PQ is - " + newTimeOfRemoving2);
    }
}
