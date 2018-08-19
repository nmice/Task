package week10.stack;

import java.util.Stack;

public class StackOwnTestDrive {

    public static void main(String[] args) {

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


/*        StackOwn stackOwn = new StackOwn();
        System.out.println(stackOwn.empty());
        System.out.println(stackOwn.push(new Integer(123)));
        System.out.println(stackOwn.push(new Integer(456)));
        System.out.println(stackOwn);
        System.out.println(stackOwn.empty());*/

    }
}
