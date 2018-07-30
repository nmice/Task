package week06.TaskG02_04_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static util.PerfTestUtil.measureTime;

public class ArrayListOwnPerfTest {

    public static final int ARRAY_LENGTH = 500_000;

    public static void main(String[] args) {

        measureTime("Insertion in the midth ArrayList", () -> fillListWithRandomIntegers(new ArrayList()));
        measureTime("Insertion in the midth ArrayListOwn", () -> fillListWithRandomIntegers(new ArrayListOwn()));
    }

    private static void fillListWithRandomIntegers(List list) {
        IntStream.generate(() -> (int) ((Math.random() * Integer.MAX_VALUE))).limit(ARRAY_LENGTH).forEach(a -> list.add(list.size() / 2, a));
    }

}
