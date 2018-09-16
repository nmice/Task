package week12.hashset;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class HashSetOwnTest {
    private Set<String> testHSO = null;
    private List<String> testCollection = null;

    @Test
    public void add() {
        testHSO = new HashSetOwn<>();
        String expected = "[]";
        assertTrue(expected.equals(testHSO.toString()));
        testHSO.add("Russia");
        expected = "[Russia]";
        assertTrue(expected.equals(testHSO.toString()));
        assertEquals(true, testHSO.add("USA"));
        assertEquals(false, testHSO.add("Russia"));
    }

    @Test
    public void size() {
        testHSO = new HashSetOwn<>();
        assertEquals(0, testHSO.size());
        testHSO.add("Russia");
        assertEquals(1, testHSO.size());
    }

    @Test
    public void isEmpty() {
        testHSO = new HashSetOwn<>();
        assertEquals(true, testHSO.isEmpty());
        testHSO.add("Russia");
        assertEquals(false, testHSO.isEmpty());
    }

    @Before
    public void before() throws Exception {
        testHSO = new HashSetOwn<>();
        testHSO.add("Russia");
        testHSO.add("USA");
        testHSO.add("France");

        testCollection = new ArrayList<>();
        testCollection.add("Bratislava");
        testCollection.add("Yugoslavia");
        testCollection.add("France");
    }

    @Test
    public void contains() {
        assertEquals(false, testHSO.contains("Germany"));
        assertEquals(true, testHSO.contains("USA"));
    }

    @Test
    public void remove() {
        testHSO.remove("USA");
        assertEquals(true, testHSO.remove("France"));
        assertEquals(false, testHSO.remove("India"));
        assertEquals("[Russia]", testHSO.toString());
    }

    @Test
    public void clear() {
        testHSO.clear();
        assertEquals("[]", testHSO.toString());
    }

    @Test
    public void containsAll() {
        assertEquals(false, testHSO.containsAll(testCollection));
        testCollection.remove("Bratislava");
        testCollection.remove("Yugoslavia");
        assertEquals(true, testHSO.containsAll(testCollection));
    }

    @Test
    public void addAll() {
        assertEquals(true, testHSO.addAll(testCollection));
        testCollection.remove("Bratislava");
        testCollection.remove("Yugoslavia");
        assertEquals(false, testHSO.addAll(testCollection));
    }

    @Test
    public void retainAll() {
        testHSO.retainAll(testCollection);
        assertEquals("[France]", testHSO.toString());
    }

    @Test
    public void removeAll() {
        assertEquals(true, testHSO.removeAll(testCollection));
        testCollection.remove("France");
        assertEquals(false, testHSO.removeAll(testCollection));
    }
}