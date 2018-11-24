package week19;

public class Question3 {

    public Question3(){
        System.out.println("new Q is born");
    }

    static{
        System.out.println("Is a static constructor?");
    }

    public static void main(String[] args) {
        System.out.println("A1");
        Question3.printThis("A2");
        Question3 q3 = new Question3();
    }

    private static void printThis(String a2) {
        System.out.println(a2);
    }
}