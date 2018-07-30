package week07.Task_LinkedList;

import java.util.Arrays;

public class LinkedListOwnTestDrive {
    public static void main(String[] args) {
        LinkedListOwn<Integer> numbers = new LinkedListOwn<>();
        System.out.println("New LLO is empty - is a " + numbers.isEmpty());
        System.out.println(numbers);
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
        numbers.remove(Integer.valueOf(667));
        System.out.println("Remove node \"667\" - is a " + numbers);
        System.out.println("Third element of LLO is a " + numbers.get(3));
        System.out.println("Set second element of LLO - " + numbers.set(2, 555) + " to \"555\" is a " + numbers);
        System.out.println("Last index of \"669\" is a " + numbers.lastIndexOf(669));
        numbers.add(2, 554);
        System.out.println("Add second element (554) is a " + numbers);
        System.out.println("Remove third element (" + numbers.remove(3) + ") is a " + numbers);
        numbers.clear();
        System.out.println("Clear LLO is a " + numbers);

//        final LinkedListOwn test = new LinkedListOwn();
//        test.add("Putin is a gay");
//        System.out.println(test);
//        test.clear();
//        System.out.println(test);
//
//        final String a = "abc";
//        a.concat("def");
//        System.out.println(a);
//
//        final StringBuilder sb = new StringBuilder();
//        sb.append("123");
//        System.out.println(sb);
    }
}
