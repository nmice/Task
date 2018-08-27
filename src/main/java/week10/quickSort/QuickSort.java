package week10.quickSort;

import week07.Task_LinkedList.LinkedListOwn;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        Integer[] myArray = {184, 124, 187, 136, 185, 2041, 0, -100, 1, 256, 4};
        System.out.println("Your Array: " + Arrays.toString(myArray));
        System.out.println("Sorted Array by quickSort: " + Arrays.toString(quickSortArray(myArray)));
    }

    public static Integer[] quickSortArray(Integer[] array) {
        if (array.length == 1) {
            return array;
        }
        Integer primary = array[array.length / 2];
        for (int i = 0; i <= primary; i++) {
            
        }

        return array;
    }
}