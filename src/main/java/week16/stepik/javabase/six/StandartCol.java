package week16.stepik.javabase.six;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class StandartCol {
    public static void main(String[] args) {
        Collection<?> collection = new LinkedList<>();
        Object object = new Object();

        collection.iterator();;
        collection.toArray();
        collection.contains(object);
        collection.size();
        collection.remove(object);
        collection.clear();
        /*collection.addAll(Arrays.asList(object));
        collection.add(object);*/
    }
}
