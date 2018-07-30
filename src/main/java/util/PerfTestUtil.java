package util;

public class PerfTestUtil {
    public static void measureTime(String header, Runnable task) {
        System.out.println(header);
        long before = System.currentTimeMillis();
        task.run();
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
