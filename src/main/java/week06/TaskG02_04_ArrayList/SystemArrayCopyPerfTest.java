package week06.TaskG02_04_ArrayList;

public class SystemArrayCopyPerfTest {

    public static final int ARRAY_LENGTH = 1_000_000_000;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = (int) (Math.random() * ARRAY_LENGTH);
        }

        measureTime("Manual Removing Solution", () -> removeManually(array, 5000));
        measureTime("SAC Removing Solution", () -> removeFromSystemArrayCopy(array, 5000));
    }


    public static int[] removeManually(int[] array, int removeIndex) {
        for (int after = removeIndex; after < array.length - 1; after++) {
            array[after] = array[after + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }

    public static int[] removeFromSystemArrayCopy(int[] array, int removeIndex) {
        System.arraycopy(array, removeIndex + 1, array, removeIndex, array.length - removeIndex - 1);
        return array;
    }

    public static void measureTime(String header, Runnable task) {
        System.out.println(header);
        long before = System.currentTimeMillis();
        task.run();
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
