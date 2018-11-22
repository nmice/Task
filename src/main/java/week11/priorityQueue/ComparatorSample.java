package week11.priorityQueue;

import java.util.PriorityQueue;

public class ComparatorSample {
    public static void main(String args[]) {

        // create priority queue
        PriorityQueue<Integer> prq = new PriorityQueue<>();

        // insert values in the queue
        prq.add(6);
        prq.add(9);
        prq.add(5);
        prq.add(64);
        prq.add(6);

        System.out.println("Priority queue values are: " + prq);

        System.out.println("Comparator value is: " + prq.comparator());
    }
}

