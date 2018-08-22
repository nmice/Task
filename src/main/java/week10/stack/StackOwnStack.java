package week10.stack;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackOwnStack<E> implements IStack<E> {
    Stack<E> stack = new Stack<>();

    @Override
    public E push(E item) {
        stack.push(item);
        return item;
    }

    @Override
    public E pop() {
        return stack.pop();
    }

    @Override
    public E peek() {
        return stack.peek();
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    public String toString(){
        return stack.toString();
    }
}
