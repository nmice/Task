package week07.Task_LinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Implement your own LinkedListOwn (should implement List<E>), so that it would be testable with the unit
 * and performance tests from the previous task.
 */

public class LinkedListOwn<E> implements List<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Node current = first; current != null; current = current.next) {
            if (current.item.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (Node current = first; current != null; current = current.next) {
            array[i++] = current.item;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        Node<E> node = new Node<>();
        node.item = e;

        if (size == 0) {
            first = node;
        } else {
            last.next = node;
            node.prev = last;
        }
        size++;
        last = node;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (Node current = first; current != null; current = current.next) {
            if (current.item.equals(o)) {
                while (current != null) {
                    current.item = current.next.item;
                    current = current.next;
                }
                last = null;
                size--;
                return true;
            }
        }
        throw new UnsupportedOperationException("The item to remove is not in this LinkedListOwn");
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
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Node current = first; current != null; current = current.next) {
            result.append(result.length() == 0 ? "[" : ", ");
            result.append(current.item);
        }
        return result.toString() + "]";
    }

//    public static void main(String[] args) {
//        System.out.println(new LinkedListOwn<>().Node.Node1().s);
//    }

    private static class Node<E> {
        private E item;
        private Node<E> next;
        private Node<E> prev;

//        private static class Node1{
//            private String s = "123";
//        }
    }
}

