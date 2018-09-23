package week12.hashset;

import week07.Task_LinkedList.LinkedListOwn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTestDrive {
    public static void main(String[] args) {
        Set<String> testSet = new HashSetOwn<>();
        testSet.add("Russia");
        testSet.add("USA");
        testSet.add("Germany");
        testSet.add("England");
        testSet.add("Australia");
        System.out.println(testSet);
        Object[] countrys = testSet.toArray();
        System.out.println(Arrays.toString(countrys));
        List<String> testAllSet = new LinkedListOwn<>();
        testAllSet.add("Australia");
        testAllSet.add("Bosnia");
        testAllSet.add("Herzegovina");
        testAllSet.add("Bratislava");
        System.out.println(testSet.containsAll(testAllSet));
        System.out.println(testSet);
    }


}
