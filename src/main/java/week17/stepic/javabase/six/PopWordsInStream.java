package week17.stepic.javabase.six;


import java.util.*;
import java.util.stream.Stream;

/**
 * Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов,
 * и в конце выводящую 10 наиболее часто встречающихся слов.
 * Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр. Например, в
 * строке "Мама мыла раму 33 раза!" ровно пять слов: "Мама", "мыла", "раму", "33" и "раза".
 * <p>
 * Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово.
 * Выводите слова в нижнем регистре.
 * <p>
 * Если в тексте меньше 10 уникальных слов, то выводите сколько есть.
 * Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте,
 * то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.
 * Задача имеет красивое решение через стримы без циклов и условных операторов. Попробуйте придумать его.
 * <p>
 * Sample Input 1:
 * Мама мыла-мыла-мыла раму!
 * <p>
 * Sample Output 1:
 * мыла
 * мама
 * раму
 * <p>
 * Sample Input 2:
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam,
 * tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus
 * imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet,
 * consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.
 * <p>
 * Sample Output 2:
 * consectetur
 * faucibus
 * ipsum
 * lorem
 * adipiscing
 * amet
 * dolor
 * eget
 * elit
 * mi
 */

public class PopWordsInStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordsByFreq = new HashMap<>();

        while (scanner.hasNext()) {
            String wordFromScan = scanner.next().toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9]", " ");
            String[] words = wordFromScan.split(" ");
            for (String word : words) {
                if (wordsByFreq.containsKey(word)) {
                    wordsByFreq.put(word, wordsByFreq.get(word) + 1);
                } else {
                    wordsByFreq.put(word, 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> listFromWords = new ArrayList<>(wordsByFreq.entrySet());

        Comparator<Map.Entry<String, Integer>> wordsComparator = new FreqComparator().thenComparing(new LexComparator());

        Stream<Map.Entry<String, Integer>> entryStream = listFromWords.stream()
                .sorted(wordsComparator)
                .limit(10);
        entryStream.forEach(p -> System.out.println(p.getKey()));
    }

    static class FreqComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry o1, Map.Entry o2) {
            return ((Integer) o2.getValue()).compareTo((Integer) o1.getValue());
        }
    }

    static class LexComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry o1, Map.Entry o2) {
            return ((String) o1.getKey()).compareTo((String) o2.getKey());
        }
    }
}