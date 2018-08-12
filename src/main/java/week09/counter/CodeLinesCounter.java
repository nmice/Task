package week09.counter;

import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CodeLinesCounter {

//1) Предоставить доступ к файлам в папке SRC
//2) Посчитать количество файлов с расширением .java
//3) Создать int переменную счетчика строк
//4) Запустить цикл с первого до последнего класса - прогнать через метод подсчета с возвратом результата - суммировать результат
//4.1) Прочитать файл
//4.2) Посчитать количество переходов на новую линию \r\n, пока новая строка не null
//4.3) Суммировать кол-во переходов к счетчику строк
//4.4) При выходе из цикла вернуть значение

    public static void main(String[] args) throws IOException {
        int counter = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String extention = reader.readLine();
        String wayToFolder = reader.readLine();//TODO

        List<File> listOfFiles = Files.walk(Paths.get(extention.equals("\r\n") ? "d:/Repos/Task/src/" : extention))
                .filter(Files::isRegularFile)
                .filter(path -> FilenameUtils.getExtension(path.toString()).equals("java"))
                .map(Path::toFile)
                .collect(Collectors.toList());

        for (File file : listOfFiles) {
            counter += countCodeLinesOfFile(file);
        }

        System.out.println("Result counter = " + counter);
    }

    public static int countCodeLinesOfFile(File file) throws IOException {
        int counter = 0;
        //Создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //Создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        //Считываем первую строку
        String line = reader.readLine();
        //Инкрементируем счетчик
        counter++;
        while (line != null) {
            // считываем остальные строки в цикле
            line = reader.readLine();
            //Инкрементируем счетчик
            counter++;
        }
        return counter;
    }
}
