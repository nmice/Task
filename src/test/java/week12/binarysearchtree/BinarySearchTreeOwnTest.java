package week12.binarysearchtree;

import org.junit.Before;
import org.junit.Test;
import week10.quickSort.Book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

import static org.junit.Assert.*;

public class BinarySearchTreeOwnTest {
    private Set<String> testStringBSTO = null;
    private Set<Book> testBookBSTO = null;
    private Set<Book> testBookWithComparatorBSTO = null;

    static class BookTitleComparator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

    @Test
    public void add() {
        testStringBSTO = new BinarySearchTreeOwn<>();
        String expected = "[]";
        assertTrue(expected.equals(testStringBSTO.toString()));
        testStringBSTO.add("come");
        testStringBSTO.add("as");
        expected = "[as, come]";
        assertTrue(expected.equals(testStringBSTO.toString()));
        assertEquals(true, testStringBSTO.add("you are"));
    }


    @Before
    public void before(){
        testStringBSTO = new BinarySearchTreeOwn<>();
        testStringBSTO.add("as");
        testStringBSTO.add("come");
        testStringBSTO.add("you");
        testStringBSTO.add("are");

        testBookBSTO = new BinarySearchTreeOwn<>();
        Book book0 = new Book("Dostoevskiy", "Idiot");
        Book book1 = new Book("Gogol", "Nose");
        Book book2 = new Book("Ray Bradbury", "451 Fahrenheit");
        Book book3 = new Book("Pelevin", "Generation P");
        testBookBSTO.add(book0);
        testBookBSTO.add(book1);
        testBookBSTO.add(book2);
        testBookBSTO.add(book3);

        Comparator<Book> bookComparator = new BookTitleComparator();
        testBookWithComparatorBSTO = new BinarySearchTreeOwn<>(bookComparator);
        testBookWithComparatorBSTO.add(book0);
        testBookWithComparatorBSTO.add(book1);
        testBookWithComparatorBSTO.add(book2);
        testBookWithComparatorBSTO.add(book3);
    }

    @Test
    public void remove() {
        testStringBSTO.remove("as");
        testStringBSTO.remove("come");
        testStringBSTO.remove("you");
        String expected = "[are]";
        assertEquals(expected, testStringBSTO.toString());
        assertEquals(true, testStringBSTO.remove("are"));
        Book book0 = new Book("Dostoevskiy", "Idiot");
        Book book1 = new Book("Gogol", "Nose");
        Book book2 = new Book("Ray Bradbury", "451 Fahrenheit");
        Book book3 = new Book("Pelevin", "Generation P");
        testBookBSTO.remove(book1);
        testBookBSTO.remove(book3);
        testBookBSTO.remove(book0);
        expected = "[Ray Bradbury - 451 Fahrenheit]";
        assertEquals(expected, testBookBSTO.toString());
        assertTrue(testBookBSTO.remove(book2));

        testBookWithComparatorBSTO.remove(book1);
        testBookWithComparatorBSTO.remove(book3);
        expected = "[Ray Bradbury - 451 Fahrenheit, Dostoevskiy - Idiot]";
        assertEquals(expected, testBookWithComparatorBSTO.toString());
        assertEquals(false, testBookWithComparatorBSTO.remove(book1));
    }



    @Test
    public void size() {
        assertEquals(4, testStringBSTO.size());
        testStringBSTO.remove("as");
        testStringBSTO.remove("come");
        testStringBSTO.remove("you");
        testStringBSTO.remove("are");
        assertEquals(0, testStringBSTO.size());
        assertEquals(4, testBookBSTO.size());
        Book book0 = new Book("Dostoevskiy", "Idiot");
        Book book1 = new Book("Gogol", "Nose");
        Book book2 = new Book("Ray Bradbury", "451 Fahrenheit");
        Book book3 = new Book("Pelevin", "Generation P");
        testBookBSTO.remove(book0);
        testBookBSTO.remove(book1);
        testBookBSTO.remove(book2);
        testBookBSTO.remove(book3);
        assertEquals(0, testBookBSTO.size());
    }

    @Test
    public void isEmpty() {
        assertEquals(false, testStringBSTO.isEmpty());
        testStringBSTO.remove("as");
        testStringBSTO.remove("come");
        testStringBSTO.remove("you");
        testStringBSTO.remove("are");
        assertEquals(true, testStringBSTO.isEmpty());
    }

    @Test
    public void contains() {
        assertEquals(true, testStringBSTO.contains("come"));
        assertEquals(false, testStringBSTO.contains("cone"));

        assertEquals(true, testBookBSTO.contains(new Book("Pelevin", "Generation P")));
        assertEquals(false, testBookBSTO.contains(new Book("Bloch", "Effective java")));
    }

    @Test
    public void toArray() {
        String expected = "[are, as, come, you]";
        assertEquals(expected, Arrays.toString(testStringBSTO.toArray()));
    }

    @Test
    public void clear() {
        testStringBSTO.clear();
        assertEquals("[]", testStringBSTO.toString());
    }
}