package week10.stack;

public interface IStack<E> {

    E push(E item);

    E pop();

    E peek();

    boolean empty();

}
