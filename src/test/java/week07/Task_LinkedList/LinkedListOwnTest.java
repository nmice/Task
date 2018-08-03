package week07.Task_LinkedList;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class LinkedListOwnTest {
    private List testLLO = null;

    @Test
    public void add() {
        testLLO = new LinkedListOwn();
        Integer elem1 = 111;
        Integer elem2 = 222;
        Integer elem3 = 333;
        testLLO.add(elem1);
        testLLO.add(elem2);
        testLLO.add(elem3);
        String expected = "[111, 222, 333]";
        assertTrue(expected.equals(testLLO.toString()));
    }

    @Before
    public void before() {
        testLLO = new LinkedListOwn();
        Integer elem1 = 111;
        Integer elem2 = 222;
        Integer elem3 = 333;
        testLLO.add(elem1);
        testLLO.add(elem2);
        testLLO.add(elem3);
    }

    @Test
    public void size() {
        int expected = 3;
        assertEquals(expected, testLLO.size());
    }

    @Test
    public void isEmpty() {
        boolean expected = false;
        assertEquals(expected, testLLO.isEmpty());
    }

    @Test
    public void contains() {
        boolean expected = true;
        assertEquals(expected, testLLO.contains(222));
    }

    @Test
    public void containsAll() {
        List containsTest = Arrays.asList(111, 222, 333);
        boolean expected = true;
        assertEquals(expected, testLLO.containsAll(containsTest));
        List containsTest1 = Arrays.asList(111, 222, 333, 465);
        boolean expected2 = false;
        assertEquals(expected2, testLLO.containsAll(containsTest1));
    }

    @Test
    public void toArray() {
        Integer[] expected = {111, 222, 333};
        assertArrayEquals(expected, testLLO.toArray());
    }

    @Test
    public void remove() {
        testLLO.remove(Integer.valueOf(222));
        String expected = "[111, 333]";
        assertEquals(expected, testLLO.toString());
    }


    @Test
    public void get() {
        Integer expected = 222;
        assertEquals(expected, testLLO.get(1));
    }

    @Test
    public void set() {
        testLLO.set(0, 1000);
        String expected = "[1000, 222, 333]";
        assertEquals(expected, testLLO.toString());
    }

    @Test
    public void addWithIndex() {
        testLLO.add(2, 444);
        String expected = "[111, 222, 444, 333]";
        assertEquals(expected, testLLO.toString());
    }

    @Test
    public void removeByIndex() {
        testLLO.remove(1);
        String expected = "[111, 333]";
        assertEquals(expected, testLLO.toString());
    }

    @Test
    public void indexOf() {
        int expected = 2;
        assertEquals(expected, testLLO.indexOf(333));
    }

    @Test
    public void lastIndexOf() {
        testLLO.add(111);
        int expected = 3;
        assertEquals(expected, testLLO.lastIndexOf(111));
    }

    @Test
    public void clear() {
        testLLO.clear();
        String expected = "[]";
        assertEquals(expected, testLLO.toString());
    }

    @Test
    public void toArrayInAnotherArray() {
        Integer[] anotherArray = {1, 2, 3, 4, 555, 666, 777};
        String expected = "[111, 222, 333, null, 555, 666, 777]";
        assertEquals(expected, Arrays.toString(testLLO.toArray(anotherArray)));
    }

    @Test
    public void iterator() {
        StringBuilder result = new StringBuilder();
        for (Object elem: testLLO) {
            result.append(result.length() == 0 ? "" : ", ");
            result.append(elem);
        }
        String actual = "[" + result.toString() + "]";
        String expected = "[111, 222, 333]";
        assertEquals(expected, actual);
    }

    @Test
    public void addAll() {
        List addAllTest = Arrays.asList(444, 555, 666);
        testLLO.addAll(addAllTest);
        String expected1 = "[111, 222, 333, 444, 555, 666]";
        assertEquals(expected1, testLLO.toString());
        boolean expected2 = true;
        assertEquals(expected2, testLLO.addAll(addAllTest));
    }



}
