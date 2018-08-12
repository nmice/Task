package week08.hashmap;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class HashMapOwnTest {
    private Map testHMO = null;

    @Before
    public void before() {
        testHMO = new HashMapOwn();
    }

    @Test
    public void size() {
        int actual = testHMO.size();
        int expected = 0;
        assertEquals(expected, actual);
        testHMO.put(123, 456);
        actual = testHMO.size();
        expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void isEmpty() {
        boolean actual = testHMO.isEmpty();
        boolean expected = true;
        assertEquals(expected, actual);
        testHMO.put(123, 456);
        actual = testHMO.isEmpty();
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void containsKey() {
        testHMO.put(123, 456);
        boolean actual = testHMO.containsKey(123);
        boolean expected = true;
        assertEquals(expected, actual);
        actual = testHMO.containsKey(223);
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void containsValue() {
        testHMO.put(123, 456);
        boolean actual = testHMO.containsValue(456);
        boolean expected = true;
        assertEquals(expected, actual);
        actual = testHMO.containsValue(455);
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void get() {
        testHMO.put(123, 456);
        String actual = testHMO.get(123).toString();
        String expected = "456";
        assertEquals(expected, actual);
    }

    @Test
    public void put() {
        String actual = testHMO.toString();
        String expected = "{}";
        assertEquals(expected, actual);
        testHMO.put(123, 456);
        actual = testHMO.toString();
        expected = "{123=456}";
        assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        testHMO.put(123, 456);
        testHMO.put(124, 457);
        testHMO.put(124, 458);
        testHMO.remove(123);
        String actual = testHMO.toString();
        String expected = "{124=458}";
        assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        testHMO.put(123, 456);
        testHMO.put(124, 457);
        testHMO.put(125, 458);
        testHMO.clear();
        String actual = testHMO.toString();
        String expected = "{}";
        assertEquals(expected, actual);
    }
}