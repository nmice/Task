package week17.stepic.javabase.six;

/**
 * Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.
 * Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:
 * <p>
 * minMaxConsumer.accept(min, max);
 * Если стрим не содержит элементов, то вызовите
 * minMaxConsumer.accept(null, null);
 */

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMinMaxInStream {

    public static void main(String[] args) {

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        Object[] minAndMax = {null,null};
        stream.forEach(element -> {
            if (minAndMax[0] == null) minAndMax[0] = element;
            if (minAndMax[1] == null) minAndMax[1] = element;
            if (order.compare((T) minAndMax[0], element) > 0) minAndMax[0] = element;
            if (order.compare((T) minAndMax[1], element) < 0) minAndMax[1] = element;
        });
        minMaxConsumer.accept((T) minAndMax[0], (T) minAndMax[1]);
    }
}

