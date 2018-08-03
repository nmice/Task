package util;

import java.util.Collection;
import java.util.stream.IntStream;

public class PerfTestUtil {
    public static void fillWithRandomIntegers(Collection coll, int number) {
        IntStream.generate(() -> (int) ((Math.random() * Integer.MAX_VALUE))).limit(number).forEach(item -> coll.add(item));
    }

    public static void measureTime(String header, Runnable task) {
        System.out.println(header);
        long before = System.currentTimeMillis();
        task.run();
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
