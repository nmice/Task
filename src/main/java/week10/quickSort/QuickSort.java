package week10.quickSort;

import java.util.Comparator;

public class QuickSort {

    public static Comparable[] quickSortArray(Comparable[] array) { //FOR COMPARABLE ARRAY
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
            while (i < indexOfBasicElement && array[i].compareTo(array[indexOfBasicElement]) < 0) { //array[i] < array[indexOfBasicElement]
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

    public static <T> T[] quickSortArray(T[] array, Comparator<T> comparator) { // FOR T ARRAY & COMPARATOR
        return doSort(array, comparator, 0, array.length - 1);
    }

    public static <T> T[] doSort(T[] array, Comparator<T> comparator, int start, int end) {
        if (end - start <= 1) {
            return array;
        }
        int i = start;
        int j = end;
        int indexOfBasicElement = (i + j) / 2;
        while (i < j) {
            while (i < indexOfBasicElement && comparator.compare(array[i], array[indexOfBasicElement]) < 0) { //array[i] < array[indexOfBasicElement]
                i++;
            }
            while (j > indexOfBasicElement && comparator.compare(array[j], array[indexOfBasicElement]) >= 0) { //array[j] >= array[indexOfBasicElement]
                j--;
            }
            if (i < j) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == indexOfBasicElement)
                    indexOfBasicElement = j;
                else if (j == indexOfBasicElement)
                    indexOfBasicElement = i;
            }
        }
        doSort(array, comparator, start, indexOfBasicElement);
        doSort(array, comparator, indexOfBasicElement + 1, end);
        return array;
    }
}