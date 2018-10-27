package week15.stepik.javabase.five;

/**
 * Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.
 * <p>
 * Контрольная сумма данных вычисляется по следующему алгоритму:
 * <p>
 * - Контрольная сумма представляет собой число типа int.
 * <p>
 * - Контрольная сумма пустого набора данных равна нулю.
 * <p>
 * - Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле:
 * Cn+1=rotateLeft(Cn) xor bn+1 , где Cn — контрольная сумма первых n байт данных, rotateLeft — циклический сдвиг
 * бит числа на один бит влево (чтобы не изобретать велосипед, используйте Integer.rotateLeft), bn — n-ный байт данных.
 * <p>
 * - Поскольку метод не открывал данный InputStream, то и закрывать его он не должен. Выброшенное из методов InputStream
 * исключение должно выбрасываться из метода.
 * <p>
 * Пример
 * На вход подан InputStream, последовательно возвращающий три байта: 0x33 0x45 0x01. В качестве контрольной суммы должно быть возвращено число 71.
 */

import java.io.*;

public class InputStreamSum {

    public static void main(String[] args) throws IOException {
        byte[] data = {0x33, 0x45, 0x01};
        byte[] data1 = {51, 69, 1};
        byte[] data12 = {};
        InputStream myStream = new ByteArrayInputStream(data);
        System.out.println(checkSumOfStream(myStream));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        // Создаем новый объект типа ByteArrayOutputStream
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        // Задаем переменную для результата чтения n-ых байтов из потока
        int nRead;
        // Инициализируем новый массив байтов размером 1 кБ
        byte[] data = new byte[1024];
        // Запускаем цикл - записываем в переменную nRead значение, пока дальше при считывании не возникнет пустой поток
        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
        // записываем в переменную buffer последовательно значения nRead
            buffer.write(data, 0, nRead);
        }
        // Инициализируем байтовый массив представлением объекта buffer в виде массива байтов
        byte[] byteArray = buffer.toByteArray();
        // Инициализируем переменную контрольной суммы
        int sum = 0;
        // Запускаем цикл - перебираем все элементы из нашего массива байтов byteArray
        for (byte element : byteArray) {
        // Считаем контрольную сумму через рекуррентную формулу, интовое значение element приводим к байтовому без перегрузки
            sum = Integer.rotateLeft(sum, 1) ^ element & 0xFF;
        }
        // Возвращаем контрольную сумму
        return sum;
    }
}
