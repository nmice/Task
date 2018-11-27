package week19;

public class Question1 {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(127);
        Integer i2 = Integer.valueOf(127);
        System.out.println(i1 == i2);
        Integer i3 = new Integer(127);
        Integer i4 = new Integer(127);
        System.out.println(i3 == i4);
        Integer i5 = 10;
        Integer i6 = 9+1;
        System.out.println(i5 == i6);
        int a = (Integer) null;
    }
}
