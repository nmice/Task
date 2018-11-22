package week12.binarysearchtree;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BinarySTreePerfTest {

    public static int CAPACITY_OF_SET = 5_000_000;

    public static void main(String[] args) {
        Set<Integer> standart = new TreeSet<>();
        Set<Integer> my = new CustomBinarySearchTree<>();

        List<Integer> listOfElementsInStandart = new LinkedList<>();
        List<Integer> listOfElementsInMy = new LinkedList<>();

        //adding test for standart implementation
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY_OF_SET; i++) {
            Integer number = (int) (Math.random() * Integer.MAX_VALUE);
            standart.add(number);
            listOfElementsInStandart.add(number);
        }
        long timeOfAdding = System.currentTimeMillis() - beginTime;
        System.out.println("Time of adding " + CAPACITY_OF_SET + " elem in standart TreeSet is - " + timeOfAdding);

        //adding test for my implementation
        long newBeginTime = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY_OF_SET; i++) {
            Integer number = (int) (Math.random() * Integer.MAX_VALUE);
            my.add(number);
            listOfElementsInMy.add(number);
        }
        long newTimeOfAdding = System.currentTimeMillis() - newBeginTime;
        System.out.println("Time of adding " + CAPACITY_OF_SET + " elem in my BSTO is - " + newTimeOfAdding);


        //removing test for standart implementation
        long beginTime2 = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY_OF_SET; i++) {
            standart.remove(listOfElementsInStandart.remove(0));
        }
        long timeOfRemoving2 = System.currentTimeMillis() - beginTime2;
        System.out.println("Time of removing " + CAPACITY_OF_SET + " elem in standart TreeSet is - " + timeOfRemoving2);

        //removing test for my implementation
        long newBeginTime2 = System.currentTimeMillis();
        for (int i = 0; i < CAPACITY_OF_SET; i++) {
            my.remove(listOfElementsInMy.remove(0));
        }
        long newTimeOfRemoving2 = System.currentTimeMillis() - newBeginTime2;
        System.out.println("Time of removing " + CAPACITY_OF_SET + " elem in my BSTO is - " + newTimeOfRemoving2);
    }
}
