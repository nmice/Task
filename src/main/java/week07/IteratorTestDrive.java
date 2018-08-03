package week07;

import java.util.*;

import static util.PerfTestUtil.*;

public class IteratorTestDrive {
    public static void main(String[] args) {
        measureTime("sleep", new Runnable() {
            @Override
            public void run() {
                List<Integer> list = new LinkedList<>();

                fillWithRandomIntegers(list, 800_000);
                //TODO without removeAll() remove even numbers from list;
                List<Integer> list1 = new LinkedList<>();
                list1.addAll(list);
//
//                for (Integer integer : list) {
//                    if (integer % 2 == 0) {
//                        list1.remove(integer);
//                    }
//                }
//                list = list1;
            }
        });


//        Collection<Integer> list1 = new HashSet<>();
//        for (Integer integer : list) {
//            if (integer%2 == 0){
//                list1.add(integer);
//            }
//        }
//        list.removeAll(list1);


    }
}
