package week101;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MemoryErrorChecking {


    public static void main(String[] args) {
        //stackOwerflow1();

        List<BigDecimal> result = new ArrayList<>();
        for (int i = 0; i < 2000000; i++) {
            result.addAll(stackOwerflow2());
        }
        System.out.println(result.size());
    }

    public static void stackOwerflow1() {
        stackOwerflow1();
    }

    public static List<BigDecimal> stackOwerflow2() {
        List<BigDecimal> bigDecimalList = new ArrayList<>();
        for (int i = 0; i < 2000000; i++) {
            BigDecimal localDecimal = new BigDecimal(Integer.MAX_VALUE);
            bigDecimalList.add(localDecimal);
        }
        return  bigDecimalList;
    }
}
