package week10.quickSort;

import java.util.Comparator;

public class ListComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Integer)o1).compareTo((Integer)o2);
    }
}
