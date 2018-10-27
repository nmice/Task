package week16.stepik.javabase.six;

import java.util.Optional;

public class Example<X> {

    public void someMethod(Object obj) {
        X x = (X) obj;
        Optional<X> optional = Optional.empty();
/*                    It will not compile
        X x = new X();
        System.out.println(obj instanceof X);
        System.out.println(obj instanceof Optional<X>);
        X[] xArray = new X[5];*/
    }
}
