package week10.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackCustomTest {

    private StackCustom<Integer> testSO = null;
    private StackCustomStack<Integer> testSOS = null;

    @Before
    public void before() {
        testSO = new StackCustom<>();
        testSOS = new StackCustomStack<>();
    }

    @Test
    public void push() {
        testSO.push(123);
        testSOS.push(123);
        String actual = testSO.toString();
        String expected = testSOS.toString();
        assertEquals(expected, actual);
        testSO.push(456);
        testSOS.push(456);
        actual = testSO.toString();
        expected = testSOS.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void pop() {
        testSO.push(123);
        testSOS.push(123);
        testSO.push(456);
        testSOS.push(456);
        testSO.push(789);
        testSOS.push(789);
        Integer actualOne = testSO.pop();
        Integer expectedOne = testSOS.pop();
        assertEquals(expectedOne, actualOne);
        String actualTwo = testSO.toString();
        String expectedTwo = testSOS.toString();
        assertEquals(expectedTwo, actualTwo);
    }

    @Test
    public void peek() {
        testSO.push(123);
        testSOS.push(123);
        testSO.push(456);
        testSOS.push(456);
        Integer actual = testSO.peek();
        Integer expected = testSOS.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void empty() {
        boolean actual = testSO.empty();
        boolean expected = testSOS.empty();
        assertEquals(expected, actual);
        testSO.push(123);
        testSOS.push(123);
        actual = testSO.empty();
        expected = testSOS.empty();
        assertEquals(expected, actual);
    }
}