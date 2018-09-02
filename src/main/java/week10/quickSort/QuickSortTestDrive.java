package week10.quickSort;

import java.util.Arrays;
import java.util.Comparator;
import static week10.quickSort.QuickSort.quickSortArray;

public class QuickSortTestDrive {

    public static void main(String[] args) {
        Integer[] myArray = {184, 124, 187, 136, 185, 2041, 0, -100, 1, 256, 4};
        System.out.println("Your Array: " + Arrays.toString(myArray));
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
        System.out.println("Your Array: ");
        for (Book b : bookArray) {
            System.out.println(b.getAuthor() + " - " + b.getTitle());
        }
        quickSortArray(bookArray, bookComparator);
        System.out.println("\r\nSorted Array by quickSort: ");
        for (Book b : bookArray) {
            System.out.println(b.getAuthor() + " - " + b.getTitle());
        }
    }
}
