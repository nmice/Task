package week17.stepic.javabase.six;

/**
 *Напишите метод, возвращающий стрим псевдослучайных целых чисел. Алгоритм генерации чисел следующий:
 *
 * Берется какое-то начальное неотрицательное число (оно будет передаваться в ваш метод проверяющей системой).
 * Первый элемент последовательности устанавливается равным этому числу.
 * Следующие элементы вычисляются по рекуррентной формуле Rn+1=mid(R2n), где mid — это функция, выделяющая второй,
 * третий и четвертый разряд переданного числа. Например, mid(123456)=345.
 * Алгоритм, конечно, дурацкий и не выдерживающий никакой критики, но для практики работы со стримами сойдет :)
 *
 * Пример
 * pseudoRandomStream(13) должен вернуть стрим, состоящий из следующих чисел:
 *
 * 13, 16, 25, 62, 384, 745, 502, 200, 0, ... (дальше бесконечное количество нулей)
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class PseudoRandomNumbers {

    public static void main(String[] args) {
        IntStream intStream = pseudoRandomStream(13);
        System.out.println(Arrays.toString(intStream.limit(10).toArray()));
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n*n)%10000)/10);
    }
}
