package week10.queue;

import org.junit.Before;
import org.junit.Test;

import java.util.Queue;

import static org.junit.Assert.*;

public class QueueOwnTest {
    private Queue<Integer> testQueueOwn = null;

    @Test
    public void add() {
        testQueueOwn = new QueueCustom<>();
        Integer elem1 = 111;
        Integer elem2 = 222;
        Integer elem3 = 333;
        testQueueOwn.add(elem1);
        testQueueOwn.add(elem2);
        String expected = "[111, 222]";
        assertTrue(expected.equals(testQueueOwn.toString()));
        assertEquals(true, testQueueOwn.add(elem3));
    }

    @Test
    public void offer() {
        testQueueOwn = new QueueCustom();
        Integer elem1 = 111;
        Integer elem2 = 222;
        Integer elem3 = 333;
        testQueueOwn.offer(elem1);
        testQueueOwn.offer(elem2);
         String expected1 = "[111, 222]";
        assertTrue(expected1.equals(testQueueOwn.toString()));
        assertEquals(true, testQueueOwn.offer(elem3));
    }

    @Before
    public void before() {
        testQueueOwn = new QueueCustom();
        Integer elem1 = 111;
        Integer elem2 = 222;
        Integer elem3 = 333;
        testQueueOwn.offer(elem1);
        testQueueOwn.offer(elem2);
        testQueueOwn.offer(elem3);
    }


    @Test
    public void remove() {
        testQueueOwn.remove();
        String expected = "[222, 333]";
        assertEquals(expected, testQueueOwn.toString());
        testQueueOwn.remove();
        Integer expected1 = 333;
        assertEquals(expected1, testQueueOwn.remove());
    }


    @Test
    public void poll() {
        testQueueOwn.poll();
        String expected = "[222, 333]";
        assertEquals(expected, testQueueOwn.toString());
        testQueueOwn.poll();
        Integer expected1 = 333;
        assertEquals(expected1, testQueueOwn.poll());
        testQueueOwn.poll();
        expected = null;
        assertEquals(expected, testQueueOwn.poll());
    }

    @Test
    public void element() {
        Integer expected = 111;
        assertEquals(expected, testQueueOwn.element());
        testQueueOwn.poll();
        expected = 222;
        assertEquals(expected, testQueueOwn.element());
    }

    @Test
    public void peek() {
        Integer expected = 111;
        assertEquals(expected, testQueueOwn.peek());
        testQueueOwn.poll();
        testQueueOwn.poll();
        testQueueOwn.poll();
        expected = null;
        assertEquals(expected, testQueueOwn.peek());
    }

    @Test
    public void clear() {
        testQueueOwn.clear();
        String expected = "[]";
        assertEquals(expected, testQueueOwn.toString());
    }
}