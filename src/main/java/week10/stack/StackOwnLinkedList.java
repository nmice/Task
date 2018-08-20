package week10.stack;


import week07.Task_LinkedList.LinkedListOwn;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class StackOwnLinkedList<E> implements IStack<E> {
    Deque<E> list = new LinkedList<>();

    @Override
    public E push(E item) {
        list.push(item);
        return item;
    }

    @Override
    public E pop() {
        return list.pop();
    }

    @Override
    public E peek() {
        return list.peek();
    }

    @Override
    public boolean empty() {
        return list.isEmpty();
    }

    public String toString(){
        return list.toString();
    }
}
