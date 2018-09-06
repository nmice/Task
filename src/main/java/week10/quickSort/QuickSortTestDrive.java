package week10.quickSort;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.sort;
import static week10.quickSort.QuickSort.quickSortArray;

public class QuickSortTestDrive {

    public static void main(String[] args) {
        //Integer[] myArray = {184, 124, 187, 136, 185, 2041, 0, -100, 1, 256, 4};
        Integer[] myArray = new Integer[11];
        for (int i=0; i<11; i++){
            myArray[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Your Array: " + Arrays.toString(myArray));

        Integer[] myArray2 = new Integer[11];
        System.arraycopy(myArray,0,myArray2,0,11);
        System.out.println("Your SECOND Array: " + Arrays.toString(myArray2));
        sort(myArray2);
        System.out.println("Sorted SECOND Array by sort: " + Arrays.toString(myArray2));

        System.out.println("Sorted Array by quickSort: " + Arrays.toString(quickSortArray(myArray)));


        Comparator<Book> bookComparator = new BookAuthorComparator().thenComparing(new BookTitleComparator());
        Book[] bookArray = new Book[10];
        bookArray[0] = new Book("Pushkin", "Eugene Onegin");
        bookArray[1] = new Book("Pushkin", "The Tale about Tsar Saltan");
        bookArray[2] = new Book("Gogol", "Viy");
        bookArray[3] = new Book("Gogol", "Evenings on a farm near Dikanka");
        bookArray[4] = new Book("Lermontov", "Sail");
        bookArray[5] = new Book("Tolstoy", "War & Peace");
        bookArray[6] = new Book("Dostoevskiy", "Idiot");
        bookArray[7] = new Book("Gogol", "Nose");
        bookArray[8] = new Book("Bradbury", "451 Fahrenheit");
        bookArray[9] = new Book("Pelevin", "Generation P");
        System.out.println("Your Array: " + Arrays.toString(bookArray));

        Book[] bookArray2 = new Book[10];
        System.arraycopy(bookArray,0,bookArray2,0,10);
        System.out.println("Your SECOND Array: " + Arrays.toString(bookArray2));
        sort(bookArray2);
        System.out.println("Sorted SECOND Array by sort: " + Arrays.toString(bookArray2));

        quickSortArray(bookArray, bookComparator);
        System.out.println("Sorted Array by quickSort: " + Arrays.toString(bookArray));

    }
}
