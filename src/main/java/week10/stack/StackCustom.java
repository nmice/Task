package week10.stack;


import week07.Task_LinkedList.CustomLinkedList;

import java.util.List;

public class StackCustom<E> implements IStack<E> {

    List<E> list = new CustomLinkedList();

    @Override
    public E push(E item) {
        list.add(item);
        return item;
    }

    @Override
    public E pop() {
        E poppingElement = list.remove(list.size() - 1);
        return poppingElement;
    }

    @Override
    public E peek() {
        return list.get(list.size() - 1);
    }

    @Override
    public boolean empty() {
        return list.isEmpty();
    }

    public String toString(){
        return list.toString();
    }
}
