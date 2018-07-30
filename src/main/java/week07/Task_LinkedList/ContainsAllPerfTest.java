package week07.Task_LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static util.PerfTestUtil.measureTime;

public class ContainsAllPerfTest {

    public static final int LIST_LENGTH = 200_000;

    public static void main(String[] args) {
        List listOwn = fillListWithRandomIntegers(new LinkedListOwn());
        List list = new ArrayList() {
            {
                addAll(listOwn);
                add(1);
            }
        };
        measureTime("containsAll", () -> listOwn.containsAll(list));
    }

    private static List fillListWithRandomIntegers(List list) {
        IntStream.generate(() -> (int) ((Math.random() * Integer.MAX_VALUE))).limit(LIST_LENGTH).forEach(a -> list.add(a));
        return list;
    }


}
