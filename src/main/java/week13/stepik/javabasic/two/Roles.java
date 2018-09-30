package week13.stepik.javabasic.two;

public class Roles {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        //Создаем класс Реплика - у него есть 3 поля - Номер, Роль, Фраза
        class Replica {
            private int number;
            private String role;
            private String phrase;
        }
        //Создаем массив Объектов длиной кол-во переданных фраз, каждая ячейка которого - это Реплика.
        Replica[] replicas = new Replica[textLines.length];
        //Инициализируем счетчик фраз на 1
        int counter = 1;
        //Создаем переменную строку, в неё будем заносить строку из ячейки массива фраз.
        String text;
        //Берем 1ую строчку - в поле Номер заносим значение счетчика++, в поле Роль - текст до : (с применением trim()), в поле Фраза всё остальное(с применением trim())
        //Проводим такую же операцию для всех оставльных фраз.
        for (int index = 0; index < textLines.length; index++) {
            text = textLines[index];
            Replica replica = new Replica();
            replica.number = counter++;
            replica.role = text.substring(0, text.indexOf(':')).trim();
            replica.phrase = text.substring(text.indexOf(":") + 1).trim();
            replicas[index] = replica;
        }
        //По итогу у нас массив Реплик.
        //Создаём результирующий билдер
        StringBuilder resultBuilder = new StringBuilder("");
        //Теперь берем роли из массива ролей от 0-й до до роли номер длинаМассиваРолей-1.
        for (int indexOfRole = 0; indexOfRole < roles.length; indexOfRole++) {
            //Печатаем её + :,
            resultBuilder.append(roles[indexOfRole]);
            resultBuilder.append(":\r\n");
            //Берем Ячейки от 0-й до длины массива Реплик.
            for (int index = 0; index < replicas.length; index++) {
                //Если поле Роль равно данной Роли, то печатаем поле номер, ), Реплику.
                if (replicas[index].role.equals(roles[indexOfRole])) {
                    resultBuilder.append(replicas[index].number);
                    resultBuilder.append(") ");
                    resultBuilder.append(replicas[index].phrase);
                    resultBuilder.append(index == replicas.length - 1 ? "" : "\r\n");
                }
                //Иначе, берем следующую ячейку.
            }
            //Печатаем пустую строку""
            resultBuilder.append(indexOfRole == roles.length - 1 ? "" : "\r\n");
        }
        //И так далее до роли номер длинаМассиваРолей-1
        return resultBuilder.toString();
    }
}