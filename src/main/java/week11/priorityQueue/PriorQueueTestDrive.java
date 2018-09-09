package week11.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorQueueTestDrive {

    public static void main(String[] args) {
        Queue<Integer> intQueue = new PriorityQueue<>(10);
        intQueue.add(27);
        intQueue.add(367);
        intQueue.add(124);
        intQueue.add(13);
        intQueue.add(39);
        intQueue.add(95);
        intQueue.add(225);
        intQueue.add(112);
        intQueue.add(992);
        intQueue.add(716);
        System.out.println(intQueue);

        Queue<String> strQueue = new PriorityQueue<>(10);
        strQueue.add("as");
        strQueue.add("come");
        strQueue.add("of");
        strQueue.add("you");
        strQueue.add("are");
        strQueue.add("song");
        strQueue.add("nirvana");
        strQueue.add("curt");
        strQueue.add("cobayn");
        strQueue.add("by");
        System.out.println(strQueue);


    }



}
