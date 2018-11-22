package week11.priorityQueue;

import org.junit.Before;
import org.junit.Test;
import week10.quickSort.Book;

import java.util.Comparator;
import java.util.Queue;

import static org.junit.Assert.*;

public class PriorQueueOwnTest {
    private Queue<String> testStringPQO = null;
    private Queue<Book> testBookPQO = null;
    private Queue<Book> testBookWithComparatorPQO = null;

    static class BookTitleComparator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

    @Test
    public void add() {
        testStringPQO = new PriorQueueCustom<>();
        String expected = "[]";
        assertTrue(expected.equals(testStringPQO.toString()));
        testStringPQO.add("come");
        testStringPQO.add("as");
        expected = "[as, come]";
        assertTrue(expected.equals(testStringPQO.toString()));
        assertEquals(true, testStringPQO.add("you are"));
    }

    @Test
    public void offer() {
        testStringPQO = new PriorQueueCustom<>();
        String expected = "[]";
        assertTrue(expected.equals(testStringPQO.toString()));
        testStringPQO.offer("come");
        testStringPQO.offer("as");
        expected = "[as, come]";
        assertTrue(expected.equals(testStringPQO.toString()));
        assertEquals(true, testStringPQO.offer("you are"));
    }

    @Before
    public void before(){
        testStringPQO = new PriorQueueCustom<>();
        testStringPQO.add("as");
        testStringPQO.add("come");
        testStringPQO.add("you");
        testStringPQO.add("are");

        testBookPQO = new PriorQueueCustom<>();
        Book book0 = new Book("Dostoevskiy", "Idiot");
        Book book1 = new Book("Gogol", "Nose");
        Book book2 = new Book("Ray Bradbury", "451 Fahrenheit");
        Book book3 = new Book("Pelevin", "Generation P");
        testBookPQO.add(book0);
        testBookPQO.add(book1);
        testBookPQO.add(book2);
        testBookPQO.add(book3);

        Comparator<Book> bookComparator = new BookTitleComparator();
        testBookWithComparatorPQO = new PriorQueueCustom<>(bookComparator);
        testBookWithComparatorPQO.add(book0);
        testBookWithComparatorPQO.add(book1);
        testBookWithComparatorPQO.add(book2);
        testBookWithComparatorPQO.add(book3);
    }

    @Test
    public void remove() {
        testStringPQO.remove();
        testStringPQO.remove();
        testStringPQO.remove();
        String expected = "[you]";
        assertEquals(expected, testStringPQO.toString());
        expected = "you";
        assertEquals(expected, testStringPQO.remove());

        testBookPQO.remove();
        testBookPQO.remove();
        testBookPQO.remove();
        expected = "[Ray Bradbury - 451 Fahrenheit]";
        assertEquals(expected, testBookPQO.toString());
        Book expected1 = new Book("Ray Bradbury", "451 Fahrenheit");
        assertTrue(expected1.equals(testBookPQO.remove()));

        testBookWithComparatorPQO.remove();
        testBookWithComparatorPQO.remove();
        testBookWithComparatorPQO.remove();
        expected = "[Gogol - Nose]";
        assertEquals(expected, testBookWithComparatorPQO.toString());
        expected1 = new Book("Gogol", "Nose");
        assertTrue(expected1.equals(testBookWithComparatorPQO.remove()));
    }

    @Test
    public void peek() {
        String expected = "are";
        assertEquals(expected, testStringPQO.peek());

        expected = "Dostoevskiy - Idiot";
        assertEquals(expected, testBookPQO.peek().toString());

        expected = "Ray Bradbury - 451 Fahrenheit";
        assertEquals(expected, testBookWithComparatorPQO.peek().toString());
    }

    @Test
    public void contains() {
        assertEquals(true, testStringPQO.contains("come"));
        assertEquals(false, testStringPQO.contains("cone"));

        assertEquals(true, testBookPQO.contains(new Book("Pelevin", "Generation P")));
        assertEquals(false, testBookPQO.contains(new Book("Bloch", "Effective java")));
    }

    @Test
    public void size() {
        assertEquals(4, testStringPQO.size());
        testStringPQO.remove();
        testStringPQO.remove();
        testStringPQO.remove();
        testStringPQO.remove();
        assertEquals(0, testStringPQO.size());
        assertEquals(4, testBookPQO.size());
        testBookPQO.remove();
        testBookPQO.remove();
        testBookPQO.remove();
        testBookPQO.remove();
        assertEquals(0, testBookPQO.size());
    }

    @Test
    public void clear() {
        testStringPQO.clear();
        assertEquals("[]", testStringPQO.toString());
    }

    @Test
    public void removeObject() {
        testStringPQO.remove("come");
        assertEquals(true, testStringPQO.remove("as"));
        assertEquals(false, testStringPQO.remove("Nirvana"));
        assertEquals("[are, you]", testStringPQO.toString());
    }

    @Test
    public void poll() {
        testStringPQO.poll();
        testStringPQO.poll();
        testStringPQO.poll();
        String expected = "[you]";
        assertEquals(expected, testStringPQO.toString());
        expected = "you";
        assertEquals(expected, testStringPQO.poll());

        testBookPQO.poll();
        testBookPQO.poll();
        testBookPQO.poll();
        expected = "[Ray Bradbury - 451 Fahrenheit]";
        assertEquals(expected, testBookPQO.toString());
        Book expected1 = new Book("Ray Bradbury", "451 Fahrenheit");
        assertTrue(expected1.equals(testBookPQO.poll()));

        testBookWithComparatorPQO.poll();
        testBookWithComparatorPQO.poll();
        testBookWithComparatorPQO.poll();
        expected = "[Gogol - Nose]";
        assertEquals(expected, testBookWithComparatorPQO.toString());
        expected1 = new Book("Gogol", "Nose");
        assertTrue(expected1.equals(testBookWithComparatorPQO.poll()));
    }

    @Test
    public void comparator() {
        PriorQueueCustom<Book> testBookPQO1 = new PriorQueueCustom<>();
        assertEquals(null, testBookPQO1.comparator());

        Comparator<Book> bookComparator = new BookTitleComparator();
        PriorQueueCustom<Book> testBookWithComparatorPQO1 = new PriorQueueCustom<>(bookComparator);
        assertEquals(bookComparator, testBookWithComparatorPQO1.comparator());
    }
}