package week06.TaskG02_04_ArrayList;

/**
 * Implement the class that will have the same functionality as ArrayList (add, remove elements, get size, clear the array).
 * It’s ok to implement the functionality partially. But SOMETHING SHOULD WORK
 */

public class ArrayListOwn<T> {
    private Object[] array = new Object[10];
    private int pointer = 0;

    public void add(T elem) {
        if (pointer == array.length - 1) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, pointer);
            array = newArray;
        }
        array[pointer++] = elem;
    }

    public void removeElement(int index) {
        for (int i = index; i < pointer; i++) {
            array[i] = array[i + 1];
        }
        array[pointer--] = null;
    }

    public int getSize() {
        return pointer;
    }

    public void clearTheArray() {
        for (int i = 0; i < pointer; i++) {
            array[i] = null;
        }
    }

}
