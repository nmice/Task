package week10.quickSort;

import week07.Task_LinkedList.LinkedListOwn;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        List<Integer> list = new LinkedListOwn<>();
        list.add(122);
        list.add(137);
        list.add(148);
        list.add(247);
        list.add(2028);
        list.add(-500);
        list.add(0);
        System.out.println(list);
        Comparator newComparator = (Comparator) new ListComparator();
        sortCollection(list, newComparator);
        System.out.println(list);

    }


    public static void sortCollection(Collection col, Comparator comparator){
    }


}
