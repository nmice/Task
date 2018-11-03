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

/*        if (stream.limit(1).count() == 0) {
            minMaxConsumer.accept(null, null);
        } else {
            Iterator<? extends T> iterator = stream.iterator();
            Optional<T> prev = null;
            Optional<T> min = null;
            while (iterator.hasNext()) {
                Optional<T> next = Optional.of(iterator.next());
                if (prev != null) {
                    if (order.compare(prev.get(), next.get()) < 0) {
                        min = prev;
                    } else {
                        min = next;
                    }
                }
                prev = next;
            }
            minMaxConsumer.accept(min.get(), stream.max(order).get());
        }*/

        // your implementation here
        /*
                if (stream.limit(1).count() == 0) {
            minMaxConsumer.accept(null, null);
        } else {
            Object[] max = new Object[1];
            Object[] min = new Object[1];
            max[0] = null;
            min[0] = null;
            Iterator<? extends T> iterator = stream.iterator();
            while (iterator.hasNext()) {
                if (max[0] == null) max[0] = iterator.next();
                if (min[0] == null) min[0] = iterator.next();
                int t = order.compare((T) max[0], iterator.next());
                if (t < 0) max[0] = iterator.next();
                t = order.compare((T) min[0], iterator.next());
                if (t > 0) min[0] = iterator.next();
            }
            minMaxConsumer.accept((T) min[0], (T) max[0]);
        }
         */
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

