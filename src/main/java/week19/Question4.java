package week19;

public class Question4 {
    public static void main(String[] args) {
        C c = new C();
        B b = c;
        System.out.println(B.i); // 0   0   0
        System.out.println(C.i); // 1   1   1
        System.out.println(b.a); // 2   3   3
        System.out.println(c.a); // 3   3   3
    }
}

class B{
    static int i = 0;
    int a = 2;
}

class C extends B{
    static int i = 1;
    int a = 3;
}
