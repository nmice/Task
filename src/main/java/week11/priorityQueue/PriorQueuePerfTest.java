package week11.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorQueuePerfTest {

    public static void main(String[] args) {
        Queue<Integer> standart = new PriorityQueue<>();
        Queue<Integer> my = new PriorQueueOwn<>();

        //adding test for standart implementation
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 2_000; i++) {
            Integer number = (int) (Math.random() * Integer.MAX_VALUE);
            standart.add(number);
        }
        long timeOfAdding = System.currentTimeMillis() - beginTime;
        System.out.println("Time of adding 10M elem in standart PQ is - " + timeOfAdding);

        //adding test for my implementation
        long newBeginTime = System.currentTimeMillis();
        for (int i = 0; i < 2_000; i++) {
            Integer number = (int) (Math.random() * Integer.MAX_VALUE);
            my.add(number);
        }
        long newTimeOfAdding = System.currentTimeMillis() - newBeginTime;
        System.out.println("Time of adding 10M elem in my PQ is - " + newTimeOfAdding);


        //removing test for standart implementation
        long beginTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            standart.remove();
        }
        long timeOfRemoving2 = System.currentTimeMillis() - beginTime2;
        System.out.println("Time of removing 10M elem in standart PQ is - " + timeOfRemoving2);

        //removing test for my implementation
        long newBeginTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            my.remove();
        }
        long newTimeOfRemoving2 = System.currentTimeMillis() - newBeginTime2;
        System.out.println("Time of removing 10M elem in my PQ is - " + newTimeOfRemoving2);
    }
}
