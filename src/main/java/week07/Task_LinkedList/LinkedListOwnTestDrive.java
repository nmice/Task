package week07.Task_LinkedList;

import java.util.Arrays;

public class LinkedListOwnTestDrive {
    public static void main(String[] args) {
        LinkedListOwn<Integer> numbers = new LinkedListOwn<>();
        System.out.println("New LLO is empty - is a " + numbers.isEmpty());
        System.out.println("LLO Size is a " + numbers.size());
        System.out.println("Add 4 nodes...");
        numbers.add(666);
        numbers.add(667);
        numbers.add(668);
        numbers.add(669);
        System.out.println("LLO is a " + numbers);
        System.out.println("Now new LLO is empty - is a " + numbers.isEmpty());
        System.out.println("Now LLO Size is a " + numbers.size());
        System.out.println("LLO contains \"667\" - is a " + numbers.contains(667));
        System.out.println("LLO to Array: " + Arrays.toString(numbers.toArray()));
        numbers.remove(667);
        System.out.println("Remove node \"667\" - is a " + numbers);
    }
}
