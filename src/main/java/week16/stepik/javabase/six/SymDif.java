package week16.stepik.javabase.six;

import java.util.HashSet;
import java.util.Set;

/**
 * Реализуйте метод, вычисляющий симметрическую разность двух множеств.
 * Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.
 * Пример
 * Cимметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
 */

public class SymDif {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        Set<Integer> set3 = symmetricDifference(set1, set2);
        System.out.println(set3);
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> resultSet = new HashSet<>();
        for (T elem : set1) {
            if (!set2.contains(elem)) {
                resultSet.add(elem);
            }
        }
        for (T elem : set2) {
            if (!set1.contains(elem)) {
                resultSet.add(elem);
            }
        }
        return resultSet;
    }
}
