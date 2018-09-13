package week11.priorityQueue;

import week07.Task_LinkedList.LinkedListOwn;

import java.util.Comparator;

public class PriorQueueOwn<E> extends LinkedListOwn<E> {

    //Передаю ЛЮБОЙ объект E
    //Если тип объекта наследован от Comparable, используется наш стандартный компаратор, сводящий compare() к compareTo()
    //Если же тип объекта не наследован от Comparable - тогда в конструктор должен быть передан Comparator

    private class PQComparator<E extends Comparable> implements Comparator<E> {
        @Override
        public int compare(E o1, E o2) {
            return o1.compareTo(o2);
        }
    }

    private static int DEFAULT_INITIAL_CAPACITY = 5;
    private Comparator<? extends Comparable> pqComparator = new PQComparator();
    private final Comparator<? super E> comparator;

    public PriorQueueOwn() {
        this(DEFAULT_INITIAL_CAPACITY, pqComparator);
    }

    public PriorQueueOwn(int initialCapacity) {
        this(initialCapacity, pqComparator);
    }

    public PriorQueueOwn(Comparator<E> comparator) {
        this(DEFAULT_INITIAL_CAPACITY, comparator);
    }

    public PriorQueueOwn(int initialCapacity,
                         Comparator<E> comparator) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException();
        }
        this.pqComparator = comparator;

    }

    @Override
    public boolean add(E e) {
        if (this.size() == 0) {
            this.add(e);
        } else {
            last.next = node;
            node.prev = last;
        }
        size++;
        last = node;
        return true;
    }

    @Override
    public boolean offer(E e) {
        this.add(e);
        return true;
    }

    @Override
    public E remove() {
        E old = this.get(0);
        this.remove(this.peek());
        return old;
    }

    @Override
    public E poll() {
        E result = this.get(0);
        this.remove(0);
        E hiPriority = this.get(0);
        for (int i = 0; i < this.size(); i++) {
            if (hiPriority.compareTo(this.get(i)) > 0) {
                hiPriority = this.get(i);
            }
            if (i == this.size() - 1 && hiPriority != this.get(0)) {
                E temp = this.get(0);
                this.set(0, hiPriority);
                this.set(i, temp);
            }
        }
        return result;
    }

    @Override
    public E element() {
        return this.get(0);
    }

    @Override
    public E peek() {
        if (this.size() == 0) {
            return null;
        }
        return this.get(0);
    }

}
