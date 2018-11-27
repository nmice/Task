package week10.stack;

import java.util.Stack;

public class StackCustomTestDrive {

    public static void main(String[] args) {
        System.out.println("Stack test:");
        Stack stack = new Stack();
        System.out.println(stack.empty());
        System.out.println(stack.push(new Integer(123)));
        System.out.println(stack.push(new Integer(456)));
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("\r\nStackCustom test:");
        StackCustom stackCustom = new StackCustom();
        System.out.println(stackCustom.empty());
        System.out.println(stackCustom.push(new Integer(123)));
        System.out.println(stackCustom.push(new Integer(456)));
        System.out.println(stackCustom);
        System.out.println(stackCustom.empty());
        System.out.println(stackCustom.peek());
        System.out.println(stackCustom.peek());
        System.out.println(stackCustom.pop());
        System.out.println(stackCustom.pop());
    }
}
