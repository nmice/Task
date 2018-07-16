package week06.TaskG02_04_ArrayList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Implement the class that will have the same functionality as ArrayList (add, remove elements, get size, clear the array).
 * It’s ok to implement the functionality partially. But SOMETHING SHOULD WORK
 */

public class ArrayListOwn<T> implements Iterable {

    public static final int DEFAULT_CAPACITY = 10;

    public ArrayListOwn() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayListOwn(int capacity) {
        array = new Object[capacity];
    }

    private Object[] array;
    private int currentIndex;

    public Object[] getArray() {
        return array;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void add(T elem) {
        if (currentIndex == array.length - 1) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, currentIndex);
            array = newArray;
        }
        array[currentIndex++] = elem;
    }

    public void removeElement(int index) {
        for (int i = index; i < currentIndex; i++) {//TODO System.arraycopy
            array[i] = array[i + 1];
        }
        array[currentIndex--] = null;
    }

    public int getSize() {
        return currentIndex;
    }

    public void clearTheArray() {
        for (int i = 0; i < currentIndex; i++) {
            array[i] = null;
        }
    }

    public T get(int index) {
        if (index >= currentIndex) {
            throw new IndexOutOfBoundsException("This element is not live in this ArrayListOwn");
        }
        return (T) array[index];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object elem : this) {
            result.append(result.length() == 0 ? "" : ", ");
            result.append(elem);
        }
        return result.toString();
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int pos = 0;

            public boolean hasNext() {
                return currentIndex > pos;
            }


            public Object next() {
                return array[pos++];
            }

            public void remove() {
                throw new UnsupportedOperationException("Cannot remove an element of an array.");
            }
        };
    }


    @Override
    public void forEach(Consumer action) {
        for (int i = 0; i < currentIndex; i++) {
            action.accept(array[i]);
        }
    }

    @Override
    public Spliterator spliterator() {
        throw new UnsupportedOperationException("Spliterator is not supported");
    }
}
