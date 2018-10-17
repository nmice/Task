package week14.stepik.javabase.four;

/*В этой задаче вам нужно реализовать метод, настраивающий параметры логирования. Конфигурирование в коде позволяет
выполнить более тонкую и хитрую настройку, чем при помощи properties-файла.

        Требуется выставить такие настройки, чтобы:

        Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
        Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
        Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java", независимо от серьезности
        сообщения печатались в консоль в формате XML (*) и не передавались вышестоящим обработчикам на уровнях "org.stepic", "org" и "".
        Не упомянутые здесь настройки изменяться не должны.

        (*) В реальных программах мы бы конечно печатали XML не в консоль, а в файл. Но проверяющая система не разрешает создавать
        файлы на диске, поэтому придется так.

        Подсказки:

        Level есть не только у Logger, но и у Handler.
        Передача сообщения на обработку родительскому Handler'у регулируется свойством useParentHandlers.*/

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LogMethod {

    public static void main(String[] args) {

    }

    private static void configureLogging() {
        final Logger ClassA = Logger.getLogger("org.stepic.java.logging.ClassA");
        ClassA.setLevel(Level.ALL);
        ClassA.log(Level.ALL, "SOME EXCEPTION");

        final Logger ClassB = Logger.getLogger("org.stepic.java.logging.ClassB");
        ClassB.setLevel(Level.WARNING);
        ClassB.warning("WARNING");

        final Logger logger = Logger.getLogger("org.stepic.java");
        logger.setLevel(Level.ALL);

        ConsoleHandler myHandler = new ConsoleHandler();
        myHandler.setLevel(Level.ALL);
        XMLFormatter myFormatter = new XMLFormatter();
        myHandler.setFormatter(myFormatter);

        logger.addHandler(myHandler);

        logger.setUseParentHandlers(false);
        // your implementation here
    }
}
