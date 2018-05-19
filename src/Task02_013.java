/**
 * Task02_013 - Given a three-digit number.
 * Find the number obtained by reading its digits from right to left.
 */

public class Task02_013 {

    public static void main(String[] args) throws Exception {
        int i = 213;
        //int n=(invert(i));
        printresult(invert(i)); // call method "printresult" - printing value "i" after method "invert":
    }

    public static int invert(int p) {
        int hundred = p / 100;
        int ten = (p - hundred * 100) / 10;
        int digit = p - hundred * 100 - ten * 10;
        int iinvert = digit * 100 + ten * 10 + hundred;
        return iinvert; //in this string of code i changed return "i" to return invert value of "i"
    }

    public static void printresult(int iinvertion) {
        System.out.println(iinvertion); //print value "i" after method "invert"

    }


}