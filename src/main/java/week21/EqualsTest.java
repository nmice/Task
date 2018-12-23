package week21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EqualsTest {

    @Override
    public boolean equals(Object obj) {
        if (LocalDate.now().equals(LocalDate.of(2018, 12, 23))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Object c;
        Object a;
        Object b = c = a = null;
/*        a.equals(a);//рефлексивность
        a.equals(b);
        b.equals(c);
        c.equals(a);//транзитивность
        a.equals(b);
        b.equals(a);//симметричность*/
        System.out.println(LocalDateTime.now());
        System.out.println(new EqualsTest().equals(new EqualsTest()));

        //непротиворечивость

    }

}
