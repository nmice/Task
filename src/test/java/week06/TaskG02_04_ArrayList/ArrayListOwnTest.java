package week06.TaskG02_04_ArrayList;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ArrayListOwnTest {
    private List testALO = null;

    @Test
    public void add() {
        testALO = new CustomArrayList();
        String elem0 = ("Hi All");
        String elem1 = ("!");
        String elem2 = ("third element");
        testALO.add(elem0);
        testALO.add(elem1);
        testALO.add(elem2);
        String expected = "[Hi All, !, third element]";
        assertTrue(expected.equals(testALO.toString()));
    }

    @Before
    public void before() {
        testALO = new CustomArrayList();
        String elem0 = ("Hi All");
        String elem1 = ("!");
        String elem2 = ("third element");
        testALO.add(elem0);
        testALO.add(elem1);
        testALO.add(elem2);
    }

    @Test
    public void addWithIndex() {
        testALO.add(1, "the People");
        String expected = "[Hi All, the People, !, third element]";
        assertEquals(expected, testALO.toString());
    }

    @Test
    public void set() {
        testALO.set(1, "the People");
        String expected = "[Hi All, the People, third element]";
        assertEquals(expected, testALO.toString());
    }

    @Test
    public void remove() {
        testALO.remove(2);
        String expected = "[Hi All, !]";
        assertEquals(expected, testALO.toString());
    }

    @Test
    public void size() {
        int expected = 3;
        assertEquals(expected, testALO.size());
    }

    @Test
    public void clear() {
        testALO.clear();
        String expected = "[]";
        assertEquals(expected, testALO.toString());
    }

    @Test
    public void get() {
        String expected = "third element";
        assertEquals(expected, testALO.get(2));
    }
}