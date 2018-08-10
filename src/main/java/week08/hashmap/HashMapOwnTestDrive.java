package week08.hashmap;

import java.util.Map;

public class HashMapOwnTestDrive {

    public static void main(String[] args) {
        Map<String, String> books = new HashMapOwn<String, String>();
        System.out.println("HashMap books is empty - is a " + books.isEmpty());
        System.out.println("Number of HashMap books elements is " + books.size());
        System.out.println(books);

    }


}
