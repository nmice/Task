package week10.quickSort;

import java.util.Arrays;

/*
Берем массив, выбираем у него опорный элемент
Запускаем цикл от 0го эл-та до нашего опорного
Сравниваем данный элемент с нашим опорным
Если данный меньше опорного, оставляем всё как есть.
Если данный больше опорного - меняем его с опорным элементом местами
 */

public class QuickSort {

    public static void main(String[] args) {
        Integer[] myArray = {184, 124, 187, 136, 185, 2041, 0, -100, 1, 256, 4};
        System.out.println("Your Array: " + Arrays.toString(myArray));
        System.out.println("Sorted Array by quickSort: " + Arrays.toString(quickSortArray(myArray, 0, myArray.length - 1)));
    }

    public static Integer[] quickSortArray(Integer[] array, int start, int end) {
        if (end - start <= 1) {
            return array;
        }
        Integer indexOfBasicElement = (end - start) / 2;
        int i = start;
        int j = end;
        while (i < j) {
            while (i < indexOfBasicElement && array[i] < array[indexOfBasicElement]) {
                i++;
            }
            while (j > indexOfBasicElement && array[j] >= array[indexOfBasicElement]) {
                j++;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == indexOfBasicElement)
                    indexOfBasicElement = j;
                else if (j == indexOfBasicElement)
                    indexOfBasicElement = i;
            }
        }
        quickSortArray(array, start, indexOfBasicElement);
        quickSortArray(array, indexOfBasicElement, end);
        return array;
    }
}