package week03.task13_012;
/**
 * Created by Mike Neginsky on 22.06.2018.
 */

import util.TestHelper;
import week03.Task05_064;

public class Task13_012Test {

    public static void main(String... args) {
        TestHelper.checkAllStrings(Task13_012::main,
                "",
                "Bongo Pongo Bibungo            Paris, France        2.2010\r\n" +
                        "Poo Kaka Maka                  Paris, France        1.2010\r\n" +
                        "Bongo Pongo Bibungo            Paris, France        3.2010\r\n" +
                        "Drue Kaka Maka                 Paris, France        4.2010\r\n" +
                        "Brad Pitt Olegovich            Paris, France        7.2010\r\n" +
                        "Greg Man Hate                  Paris, France        10.2010");
    }
}
