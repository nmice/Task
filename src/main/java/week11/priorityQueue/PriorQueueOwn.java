package week11.priorityQueue;

import week07.Task_LinkedList.LinkedListOwn;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PriorQueueOwn<E> extends LinkedListOwn<E> {

    //Передаю ЛЮБОЙ объект E
    //Если тип объекта наследован от Comparable, используется наш стандартный компаратор, сводящий compare() к compareTo()
    //Если же передается Comparator - используется квази переданный метод compare() от переданного компаратора.

    private static class PQComparator<E extends Comparable> implements Comparator<E> {
        @Override
        public int compare(E o1, E o2) {
            return o1.compareTo(o2);
        }
    }

    private static int DEFAULT_INITIAL_CAPACITY = 5;
    private Comparator<? super E> pqComparator = new PQComparator();
    private int comparatorCounter = 0;

    public PriorQueueOwn() {
        this(DEFAULT_INITIAL_CAPACITY, null);
    }

    public PriorQueueOwn(int initialCapacity) {
        this(initialCapacity, null);
    }

    public PriorQueueOwn(Comparator<? super E> comparator) {
        this(DEFAULT_INITIAL_CAPACITY, comparator);
    }

    public PriorQueueOwn(int initialCapacity,
                         Comparator<? super E> comparator) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException();
        }
        if (comparator != null) {
            this.pqComparator = comparator;
            this.comparatorCounter = 1;
        }
    }

    @Override
    public boolean add(E e) {
        return offer(e);
    }

    @Override
    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        if (this.size() > 0 && pqComparator.compare(e, this.peek()) <= 0) {
            super.add(0, e);
        } else {
            super.add(e);
        }
        return true;
    }

    @Override
    public E peek() {
        if (this.size() == 0) {
            return null;
        }
        return super.get(0);
    }

/*  //THIS METHODS HAVE SUPER IMPLEMENTATION & DO NOT NEED TO OVERRIDE:
    @Override
    public boolean remove(Object o) { return super.remove(o); }

    @Override
    public boolean contains(Object o) { return super.contains(o); }

    @Override
    public Object[] toArray() { return super.toArray(); }

    @Override
    public <T> T[] toArray(T[] a) { return super.toArray(a); }

    @Override
    public Iterator<E> iterator() { return super.iterator(); }

    @Override
    public int size() { return super.size(); }

    @Override
    public void clear(){ super.clear(); }*/


    @Override
    public E remove() {
        E result = this.peek();
        this.remove(0);
        E hiPriority = this.peek();
        int posOfHiPriorityElem = 0;
        final int size = super.size();
        int tempPos = 0;
        for (E elem : this) {
            if (pqComparator.compare(elem, hiPriority) < 0) {
                hiPriority = elem;
                posOfHiPriorityElem = tempPos;
            }
            tempPos++;
            if (tempPos == size && posOfHiPriorityElem != 0) {
                super.remove(posOfHiPriorityElem);
                super.add(0, hiPriority);
            }
        }

        return result;
    }

    @Override
    public E poll() {
        return this.remove();
    }

    public Comparator<? super E> comparator() {
        if (comparatorCounter != 0) {
            return pqComparator;
        }
        return null;
    }
}
