package week09.counter;

import java.io.*;

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
        File folder = new File("d:/Repo/Task/src/main/java/util");
        counter = foldersCodeLineCounter(folder, counter);

        String foldersName = "d:/Repo/Task/src/main/java/week0";
        for (int i = 1; i <= 9; i++) {
            folder = new File(foldersName + i);
            counter = foldersCodeLineCounter(folder, counter);
        }

        folder = new File("d:/Repo/Task/src/main/java/week03/garbage");
        counter = foldersCodeLineCounter(folder, counter);

        folder = new File("d:/Repo/Task/src/main/java/week03/task13_012");
        counter = foldersCodeLineCounter(folder, counter);

        folder = new File("d:/Repo/Task/src/main/java/week05/TaskG01_06_CustomListImpl_part1");
        counter = foldersCodeLineCounter(folder, counter);

        folder = new File("d:/Repo/Task/src/main/java/week06/TaskG02_04_ArrayList");
        counter = foldersCodeLineCounter(folder, counter);

        folder = new File("d:/Repo/Task/src/main/java/week07/Task_LinkedList");
        counter = foldersCodeLineCounter(folder, counter);

        folder = new File("d:/Repo/Task/src/main/java/week08/hashmap");
        counter = foldersCodeLineCounter(folder, counter);

        folder = new File("d:/Repo/Task/src/main/java/week08/student");
        counter = foldersCodeLineCounter(folder, counter);

        folder = new File("d:/Repo/Task/src/main/java/week09/counter");
        counter = foldersCodeLineCounter(folder, counter);

        System.out.println("Result counter = " + counter);
    }

    public static int foldersCodeLineCounter(File folder, int counter) throws IOException {
        File[] listOfFiles = folder.listFiles();
        for (File fileInFolder : listOfFiles) {
            if (fileInFolder.isFile()) {
                System.out.println(fileInFolder.getName());
                //Создаем объект FileReader для объекта File
                FileReader fr = new FileReader(fileInFolder);
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
            }
        }
        return counter;
    }
}
