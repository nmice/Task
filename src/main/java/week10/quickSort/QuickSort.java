package week10.quickSort;

import java.util.Comparator;

public class QuickSor<T>{

    public static Comparable[] quickSortArray(Comparable[] array) {
        return doSort(array, 0, array.length - 1);
    }

    public static Comparable[] doSort(Comparable[] array, int start, int end) {
        if (end - start <= 1) {
            return array;
        }
        int i = start;
        int j = end;
        int indexOfBasicElement = (i + j) / 2;
        while (i < j) {
            while (i < indexOfBasicElement && array[i].compareTo(array[indexOfBasicElement]) == -1) { //array[i] < array[indexOfBasicElement]
                i++;
            }
            while (j > indexOfBasicElement && array[j].compareTo(array[indexOfBasicElement]) >= 0) { //array[j] >= array[indexOfBasicElement]
                j--;
            }
            if (i < j) {
                Comparable temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == indexOfBasicElement)
                    indexOfBasicElement = j;
                else if (j == indexOfBasicElement)
                    indexOfBasicElement = i;
            }
        }
        doSort(array, start, indexOfBasicElement);
        doSort(array, indexOfBasicElement + 1, end);
        return array;
    }

    public T[] quickSortArray(T[] array, Comparator<T> comparator) {
        return doSort(array, 0, array.length - 1);
    }
}