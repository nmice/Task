package week22;

public class InitialTest {
    public static void main(String[] args) {
        Child c = null;
        Parent p = null;
        Parent pc = null;
        System.out.println(c.value);
        System.out.println(p.value);
        System.out.println(pc.value);
        c = new Child();
        p = new Parent();
        pc = new Child();
        System.out.println(c.value);
        System.out.println(p.value);
        System.out.println(pc.value);
        System.out.println(c.instanceValue);
        System.out.println(p.instanceValue);
        System.out.println(pc.instanceValue);
    //1   30   30
    }
}

class Child extends Parent{
    public static int value = 1;
    public int instanceValue = 11;
    static {
        System.out.println("Static block of init in Child");
    }
    public Child (){
        System.out.println("Constructor of Child");
    }
}

class Parent {
    public static int value = 30;
    public int instanceValue = 330;
    static {
        System.out.println("Static block of init in Parent");
    }
    public Parent (){
        System.out.println("Constructor of Parent");
    }



}

/*
    Для случая наследования класов:

public class Child extends Parent
поля объекта инициализируются в следующем порядке:

        Статические поля класса Parent;
        Статический блок инициализации класса Parent;
        Статические поля класса Сhild;
        Статический блок инициализации класса Child;
        Нестатические поля  класса Parent;
        Нестатический блок инициализации класса Parent;
        Конструктор класса Parent;
        Нестатические поля  класса Сhild;
        Нестатический блок инициализации класса Сhild;
        Конструктор класса Сhild.
*/
