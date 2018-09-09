package week10.quickSort;

import org.junit.Before;
import org.junit.Test;
import java.util.Comparator;

import static java.util.Arrays.sort;
import static org.junit.Assert.*;
import static week10.quickSort.QuickSort.quickSortArray;

public class QuickSortTest {
    private Integer[] testIntArray1 = new Integer[100];
    private Integer[] testIntArray2 = new Integer[100];
    private String[] testStrArray1 = new String[100];
    private String[] testStrArray2 = new String[100];
    private Book[] testBookArray1 = new Book[10];
    private Book[] testBookArray2 = new Book[10];

    class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }
    class StringComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
    private Comparator<Integer> integerComparator = new IntegerComparator();
    private Comparator<String> stringComparator = new StringComparator();
    private Comparator<Book> bookComparator = new BookAuthorComparator().thenComparing(new BookTitleComparator());


    @Before
    public void before() {
        //Integer:
        for (int i = 0; i < 100; i++) {
            testIntArray1[i] = (int) (Math.random() * 1000);
        }
        System.arraycopy(testIntArray1, 0, testIntArray2, 0, 100);
        //String:
        for (int i = 0; i < 100; i++) {
            testStrArray1[i] = Long.toHexString(Double.doubleToLongBits(Math.random()));
        }
        System.arraycopy(testStrArray1, 0, testStrArray2, 0, 100);
        //My Class:
        testBookArray1[0] = new Book("Pushkin", "Eugene Onegin");
        testBookArray1[1] = new Book("Pushkin", "The Tale about Tsar Saltan");
        testBookArray1[2] = new Book("Gogol", "Viy");
        testBookArray1[3] = new Book("Gogol", "Evenings on a farm near Dikanka");
        testBookArray1[4] = new Book("Lermontov", "Sail");
        testBookArray1[5] = new Book("Tolstoy", "War & Peace");
        testBookArray1[6] = new Book("Dostoevskiy", "Idiot");
        testBookArray1[7] = new Book("Gogol", "Nose");
        testBookArray1[8] = new Book("Bradbury", "451 Fahrenheit");
        testBookArray1[9] = new Book("Pelevin", "Generation P");
        System.arraycopy(testBookArray1, 0, testBookArray2, 0, 10);
    }

    @Test
    public void quickSortArrayComparable() {
        sort(testIntArray1);
        assertArrayEquals(testIntArray1, quickSortArray(testIntArray2));
        sort(testStrArray1);
        assertArrayEquals(testStrArray1, quickSortArray(testStrArray2));
        sort(testBookArray1);
        assertArrayEquals(testBookArray1, quickSortArray(testBookArray2));
    }

    @Test
    public void quickSortArrayComparator() {
        sort(testIntArray1, integerComparator);
        assertArrayEquals(testIntArray1, quickSortArray(testIntArray2, integerComparator));
        sort(testStrArray1, stringComparator);
        assertArrayEquals(testStrArray1, quickSortArray(testStrArray2, stringComparator));
        sort(testBookArray1, bookComparator);
        assertArrayEquals(testBookArray1, quickSortArray(testBookArray2, bookComparator));
    }
}