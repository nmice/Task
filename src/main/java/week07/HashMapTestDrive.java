package week07;

import java.util.HashMap;
import java.util.Map;

public class HashMapTestDrive {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addNumber("Babushkin", "9260000000");
        phoneBook.addNumber("Vabushkin", "9030000000");
        String number = phoneBook.getNumber("VaBushkin");
        System.out.println(number);
        System.out.println(phoneBook);
        System.out.println(phoneBook.getSize());
    }

    private static class PhoneBook {
        private Map<String, String> nameToNumberMap = new HashMap<>();

        public void addNumber(String name, String number) {
            nameToNumberMap.put(name.toLowerCase(), number);
        }

        public String getNumber(String name) {
            return nameToNumberMap.get(name.toLowerCase());
        }

        public int getSize() {
            return nameToNumberMap.size();
        }

        public String toString(){
            return nameToNumberMap.toString();
        }
    }
}
