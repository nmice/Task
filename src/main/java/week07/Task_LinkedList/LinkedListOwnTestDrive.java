package week07.Task_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOwnTestDrive {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedListOwn<>();
        System.out.println("New LLO is empty - is a " + numbers.isEmpty());
        System.out.println(numbers);
        System.out.println("LLO Size is a " + numbers.size());
        System.out.println("Add 1 nodes...");
        numbers.add(666);
        numbers.add(667);
        numbers.add(668);
        numbers.add(669);
        System.out.println("LLO is a " + numbers);
        for (Integer num : numbers) {
            if (num>668){
                System.out.println(num);
                numbers.iterator().remove();
            }
        }
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println("Now new LLO is empty - is a " + numbers.isEmpty());
        System.out.println("Now LLO Size is a " + numbers.size());
        System.out.println("LLO contains \"667\" - is a " + numbers.contains(667));
        System.out.println("LLO to Array: " + Arrays.toString(numbers.toArray()));
        System.out.println("Third element of LLO is a " + numbers.get(1));
        System.out.println("Set second element of LLO - " + numbers.set(1, 555) + " to \"555\" is a " + numbers);
        System.out.println("Last index of \"667\" is a " + numbers.lastIndexOf(667));
        numbers.add(2, 554);
        System.out.println("Add element №2 - (554) is a " + numbers);
        System.out.println("Remove element 2 (" + numbers.remove(2) + ") is a " + numbers);
        List containsTest = Arrays.asList(666, 667, 668);
        System.out.println("LLO contains (666, 667, 668) is a " + numbers.containsAll(containsTest));
        StringBuilder result = new StringBuilder();
        for (Integer elem: numbers) {
        result.append(result.length() == 0 ? "" : ", ");
        result.append(elem);
        }
        System.out.println("[" + result.toString() + "]");


        List addAllTest = Arrays.asList(670, 671, 672);
        System.out.println(numbers.addAll(addAllTest));
        System.out.println(numbers);

        List removeAllTest = Arrays.asList(670, 671, 672, 666);
        System.out.println(numbers.removeAll(removeAllTest));
        System.out.println(numbers);

        numbers.clear();
        System.out.println("Clear LLO is a " + numbers);

        LinkedListOwn<String> numbersLL = new LinkedListOwn<>();
        numbersLL.add("start");
        numbersLL.add("start1");
        numbersLL.add("start2");
        String[] testArray = {"me", "today", "me1", "today1", "me2", "today2"};
        System.out.println(Arrays.toString(numbersLL.toArray(testArray)));

        final LinkedListOwn test = new LinkedListOwn();
        test.add("Hi All");
        System.out.println(test);
        test.clear();
        System.out.println(test);

        final String a = "abc";
        a.concat("def");
        System.out.println(a);

        final StringBuilder sb = new StringBuilder();
        sb.append("123");
        System.out.println(sb);
    }
}
