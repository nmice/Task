package week10.stack;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class StackOwnTest {

    private StackOwn<Integer> testSO = null;
    private StackOwnLinkedList<Integer> testSOLL = null;

    @Before
    public void before() {
        testSO = new StackOwn<>();
        testSOLL = new StackOwnLinkedList<>();
    }

    @Test
    public void push() {
        testSO.push(123);
        testSOLL.push(123);
        String actual = testSO.toString();
        String expected = testSOLL.toString();
        assertEquals(expected, actual);
        testSO.push(456);
        testSOLL.push(456);
        actual = testSO.toString();
        expected = testSOLL.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void pop() {
    }

    @Test
    public void peek() {

    }

    @Test
    public void empty() {
        boolean actual = testSO.empty();
        boolean expected = testSOLL.empty();
        assertEquals(expected, actual);
        testSO.push(123);
        testSOLL.push(123);
        actual = testSO.empty();
        expected = testSOLL.empty();
        assertEquals(expected, actual);
    }
}