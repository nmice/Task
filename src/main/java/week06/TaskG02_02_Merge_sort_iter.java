package week06;
/**
 * Merge_sort - Implement iterative solution (i.e. without recursion)
 */

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class TaskG02_02_Merge_sort_iter {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word string:");
        String words = scanner.nextLine();
        Comparable[] array = words.split(" ");
        System.out.println("Your Array: " + "\r\n" + Arrays.toString(array));
        System.out.println("Merge Sort Array: " + "\r\n" + Arrays.toString(mergeSortRec(array)));
        System.out.println("Merge Sort Array: " + "\r\n" + Arrays.toString(mergeSortIter(array)));
    }

    public static Comparable[] mergeSortRec(Comparable[] array) {
        if (array.length < 2) {
            return array;
        } else {
            Comparable[] leftHalf = Arrays.copyOfRange(array, 0, array.length / 2);
            Comparable[] rightHalf = Arrays.copyOfRange(array, array.length / 2, array.length);
            return mergeSortedArrays(mergeSortRec(leftHalf), mergeSortRec(rightHalf));
        }//end of method
    }//end of method


    public static Comparable[] mergeSortIter(Comparable[] array) {
        /*
        Допустим есть массив из 9 элементов
        Нужно делить его на части пока не останется 2 или 1 элемент,
        а в смержином массиве не будет того же кол-ва элементов, что и в изначальном
        1 итерация - создаем 2 новых массива:
        левая часть - от 0-го до a.length.2/2 = 4   -  это элементы 0,1,2,3 массива
        правая часть - от a.length.2/2 (4-го) до конечного элемента a.length-1 -  это элементы 4,5,6,7,8 массива
        -Проверяем условие - если 1 элемент - оставляем,
        -если 2 элемента - если 1>2-го то свапаем, если нет, оставляем
        -Если больше элементов, то следующая итерация

        Длины новых массивов - от 1 до a.length/2, каждый раз в 2 раза больше
        Номера массивов - перебор от 0-го до последнего, с шагом номер эл-та+ 2х длина массива в проходке
        Взяли первый массив(от номера эл-та в итерации до номер + длина массива в итерации)
        Взяли второй массив(от номера эл-та в итерации + длина массива в итерации до номер + 2x длина массива в итерации)
         */
        for (int newArraysLength = 1; newArraysLength <= array.length / 2; newArraysLength *= 2) {
            for (int newArrayIndex = 0; newArrayIndex < array.length; newArrayIndex += newArraysLength) {
                Comparable[] leftHalf = Arrays.copyOfRange(array, newArrayIndex, newArrayIndex + newArraysLength);
                Comparable[] rightHalf = Arrays.copyOfRange(array, newArrayIndex + newArraysLength, newArrayIndex + 2 * newArraysLength);
                mergeSortedArrays(leftHalf, rightHalf);
            }
        }
        return resultArray;
    }


    public static Comparable[] mergeSortedArrays(Comparable[] array1, Comparable[] array2) {
        Comparable[] resultArray = new Comparable[array1.length + array2.length];
        int array1Index = 0;
        int array2Index = 0;
        for (int resultIndex = 0; resultIndex < resultArray.length; resultIndex++) {
            if (array1Index == array1.length && array2Index < array2.length) {
                resultArray[resultIndex] = array2[array2Index++];
            } else if (array2Index == array2.length && array1Index < array1.length) {
                resultArray[resultIndex] = array1[array1Index++];
            } else if (array1[array1Index].compareTo(array2[array2Index]) < 0) {
                resultArray[resultIndex] = array1[array1Index++];
            } else {
                resultArray[resultIndex] = array2[array2Index++];
            }
        }// end of for
        return resultArray;
    }// end of method
}