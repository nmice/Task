package week06.TaskG02_04_ArrayList;

import java.util.*;
import java.util.function.Consumer;

/**
 * Implement the class that will have the same functionality as ArrayList (add, remove elements, get size, clear the array).
 * It’s ok to implement the functionality partially. But SOMETHING SHOULD WORK
 */

public class ArrayListOwn<E> implements List<E>, Iterable<E> {

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayListOwn() {this(DEFAULT_CAPACITY);}

    private ArrayListOwn(int capacity) {
        array = new Object[capacity];
    }

    private Object[] array;
    private int currentIndex;

    public Object[] getArray() {
        return array;
    }

    public boolean add(E elem) {
        if (currentIndex == array.length - 1) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, currentIndex);
            array = newArray;
        }
        array[currentIndex++] = elem;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        clearTheArray();
    }

    public void add(int index, E elem) {
        if (currentIndex == array.length - 1) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, currentIndex);
            array = newArray;
        }
        System.arraycopy(array, index, array, index + 1, currentIndex - index);
//            for (int i = currentIndex; i >= index+1; i--) {   //TODO System.arraycopy
//            array[i] = array[i - 1];
//        }
        array[index] = elem;
        currentIndex++;
    }

    @Override
    public E remove(int index) {
        E old = (E) array[index];
        removeElement(index);
        return old;

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public void removeElement(int index) {
        System.arraycopy(array, index + 1, array, index, currentIndex - index - 1);
//        for (int i = index; i < currentIndex; i++) {//TODO System.arraycopy
//            array[i] = array[i + 1];
//        }
        array[currentIndex--] = null;
        if (currentIndex < array.length / 2 && array.length / 2 >= DEFAULT_CAPACITY) {
            Object[] newArray = new Object[array.length / 2];
            System.arraycopy(array, 0, newArray, 0, currentIndex);
            array = newArray;
        }
    }

    public int getSize() {
        return currentIndex;
    }

    public void clearTheArray() {
        for (int i = 0; i < currentIndex; i++) {
            array[i] = null;
        }
        currentIndex = 0;
    }

    public E get(int index) {
        if (index >= currentIndex) {
            throw new IndexOutOfBoundsException("This element is not live in this ArrayListOwn");
        }
        return (E) array[index];
    }

    @Override
    public E set(int index, E element) {
        E old = (E) array[index];
        array[index] = element;
        return old;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object elem : this) {
            result.append(result.length() == 0 ? "" : ", ");
            result.append(elem);
        }
        return "[" + result.toString() + "]";
    }

    @Override
    public int size() {
        return getSize();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
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
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
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
