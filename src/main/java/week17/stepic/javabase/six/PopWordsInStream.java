package week17.stepic.javabase.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
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

    public static void main(String[] args){
        //перевести поток в строку
        //Убрать все посторонние символы(заменить на пробелы)
        //перевести все слова в строке в строчный регистр

        Scanner scanner = new Scanner(System.in);
        String wordFromScan;
        Map<String, Integer> wordsByNumber = new HashMap<>();

        while (scanner.hasNext()) {
            wordFromScan = scanner.next().toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
            if (wordsByNumber.containsKey(wordFromScan)) {
                wordsByNumber.put(wordFromScan, wordsByNumber.get(wordFromScan) + 1);
            } else {
                wordsByNumber.put(wordFromScan, 1);
            }

            List<Map<String, Integer>> listFromWords = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : wordsByNumber.entrySet()) {
                String word = entry.getKey();
                Integer number = entry.getValue();

                if (!numberByWords.containsKey(number)) {
                    numberByWords.put(number, new ArrayList<>());
                }

                numberByWords.get(number).add(word);
        }


    }
}
