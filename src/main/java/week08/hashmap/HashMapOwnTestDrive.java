package week08.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapOwnTestDrive {

    public static void main(String[] args) {
/*        System.out.println("!HASHMAP ORIGIN!");
        Map<String, String> booksOrigin = new HashMap<String, String>();
        System.out.println("HashMap books is empty - is a " + booksOrigin.isEmpty());
        System.out.println("Number of HashMap books elements is " + booksOrigin.size());
        System.out.println(booksOrigin);
        System.out.println(booksOrigin.get(null));
        booksOrigin.put("AaAaAa", "NEG");
        booksOrigin.put("AaAaAa", "NEG");
        booksOrigin.put("AaAaAa", "NEG1");
        booksOrigin.put("BBBBBB", "NEG1");
        System.out.println(booksOrigin.put("BBB", "NEG2"));
        booksOrigin.put("BBB", "NEG2");
        booksOrigin.put(null, "NEG3");
        System.out.println(booksOrigin.put(null, null));
        System.out.println(booksOrigin);
        System.out.println(booksOrigin.size());
        System.out.println(booksOrigin.get("AaAaAa"));
        System.out.println(booksOrigin.get("AaA"));
        System.out.println(booksOrigin.get(null));
        System.out.println(booksOrigin);
        System.out.println(booksOrigin.remove("AaAaAa"));
        System.out.println(booksOrigin);
        System.out.println(booksOrigin.remove(null));
        System.out.println(booksOrigin);
        System.out.println(booksOrigin.remove(null));
        System.out.println(booksOrigin);
        booksOrigin.clear();
        System.out.println(booksOrigin);*/


        System.out.println();//spacebar

        System.out.println("!HASHMAP OWN!");
        Map<String, String> books = new HashMapOwn<String, String>();
        System.out.println("HashMap books is empty - is a " + books.isEmpty());
        System.out.println("Number of HashMap books elements is " + books.size());
        System.out.println(books);
        System.out.println(books.get(null));
        books.put("AaAaAa", "NEG");
        books.put("AaAaAa", "NEG");
        books.put("AaAaAa", "NEG1");
        books.put("BBBBBB", "NEG1");
        System.out.println(books.put("BBB", "NEG2"));
        books.put("BBB", "NEG2");
        books.put(null, "NEG3");
        System.out.println(books.put(null, null));
        System.out.println(books);
        System.out.println(books.size());
        System.out.println(books.get("AaAaAa"));
        System.out.println(books.get("AaA"));
        System.out.println(books.get(null));
        System.out.println(books);
        System.out.println(books.remove("AaAaAa"));
        System.out.println(books);
        System.out.println(books.remove(null));
        System.out.println(books);
        System.out.println(books.remove(null));
        System.out.println(books);
        books.clear();
        System.out.println(books);
    }
}
