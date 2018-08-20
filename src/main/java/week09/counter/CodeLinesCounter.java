package week09.counter;

import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Implement the code counter in lines written for the entire learning time
 */

public class CodeLinesCounter {

//1) Предоставить доступ к файлам в папке SRC
//2) Посчитать количество файлов с расширением .java
//3) Создать int переменную счетчика строк
//4) Запустить цикл с первого до последнего класса - прогнать через метод подсчета с возвратом результата - суммировать результат
//4.1) Прочитать файл
//4.2) Посчитать количество переходов на новую линию \r\n, пока новая строка не null
//4.3) Суммировать кол-во переходов к счетчику строк
//4.4) При выходе из цикла вернуть значение

    public static void main(String[] args) {
        int counter = 0;


        System.out.println("Enter the path to the files: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String wayToFolder = reader.readLine().replaceAll("\\s", "");
            System.out.println((wayToFolder.equals("") ? "Default path is - d:/Repos/Task/src/" : "You path is " + wayToFolder) + "\r\n");
            System.out.println("Enter the file extension: ");
            String extention = reader.readLine().replaceAll("\\s", "");
            System.out.println(extention.equals("") ? "Default extention is - .java" : "You extention is " + extention);

            List<File> listOfFiles = Files.walk(Paths.get(wayToFolder.equals("") ? "d:/Repos/Task/src/" : wayToFolder))
                    .filter(Files::isRegularFile)
                    .filter(path -> FilenameUtils.getExtension(path.toString()).equals(extention.equals("") ? "java" : extention))
                    .map(Path::toFile)
                    .collect(Collectors.toList());

            for (File file : listOfFiles) {
                counter += countCodeLinesOfFile(file);
            }
            System.out.println("Result counter = " + counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countCodeLinesOfFile(File file) {
        int counter = 0;
        //Создаем объект FileReader для объекта File
        try (FileReader fr = new FileReader(file);
             BufferedReader reader = new BufferedReader(fr)) {
            //Создаем BufferedReader с существующего FileReader для построчного считывания
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }
}
