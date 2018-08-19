package week10.stack;


import week07.Task_LinkedList.LinkedListOwn;

import java.util.List;

public class StackOwn implements IStack {

    List list = new LinkedListOwn();

    public StackOwn() {
    }

    @Override
    public Object push(Object item) {
        list.add(item);
        return item;
    }

    @Override
    public Object pop() {
        Object poppingElement = list.remove(list.size() - 1);
        return poppingElement;
    }

    @Override
    public Object peek() {
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
