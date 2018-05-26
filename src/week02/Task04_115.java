package week02;
/**
 * In some countries of the Far East (China, Japan, etc.) a calendar was used (and is unofficially used at the
 * present time), which differs from that used by us. This calendar is a 60-year cycle system. Each 60-year cycle
 * consists of five 12-year sub-cycles. In each subcycle of the year they bear the names of animals: Rat, Cow, Tiger,
 * Hare, Dragon, Snake, Horse, Sheep, Monkey, Rooster, Dog and Pig.
 * In addition, the name of the year includes the colors of animals that are associated with the five
 * elements of nature - the Tree (green), the Fire (red), the Earth (yellow), the Metal (white) and the Water (black).
 * As a result, each animal (and its year) has a symbolic color, and this color often does not coincide with its
 * "natural" coloration - the Tiger can be black, the Pig red, and the Horse green. For example, 1984 - the year
 * of the beginning of the next cycle - was called the year of the Green Rat. Each color in the cycle (starting
 * from green) "operates" for two years, so every 60 years the name of the year (the animal and its color) repeats.
 * Create a program that, according to the given year number of our era, prints its name according to the
 * described calendar in the form: "Rat, Green". Consider two cases:
 * a) the value n 1984;
 * b) the value of n can be any natural number.
 */

import java.util.Scanner;

public class Task04_115 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input year: ");
        int n = scan.nextInt();
        chinaYear(n);
    }

    public static void chinaYear(int n) {
        String animal = null, color = null;
        /*Task a) Number of year since 1984  */
        //n=n-1983;// Number of year since 1984:
        /*Task b) Any number of year  */
        n = (n + 56) % 60 + 1;//number of year (1-60) from beginning of cycle
        //System.out.println(n);//Chek year number in cycle
        int nAnimal = (n - 1) % 12 + 1;
        switch (nAnimal) {
            case 1:
                animal = "Rat";
                break;
            case 2:
                animal = "Cow";
                break;
            case 3:
                animal = "Tiger";
                break;
            case 4:
                animal = "Hare";
                break;
            case 5:
                animal = "Dragon";
                break;
            case 6:
                animal = "Snake";
                break;
            case 7:
                animal = "Horse";
                break;
            case 8:
                animal = "Sheep";
                break;
            case 9:
                animal = "Monkey";
                break;
            case 10:
                animal = "Rooster";
                break;
            case 11:
                animal = "Dog";
                break;
            case 12:
                animal = "Pig";
                break;
            default:
                System.out.println("Un..unen..un..unexpected error");
        }

        int nColor = (n - 1) % 10 + 1;
        switch (nColor) {
            case 1:
                color = "Green";
                break;
            case 2:
                color = "Green";
                break;
            case 3:
                color = "Red";
                break;
            case 4:
                color = "Red";
                break;
            case 5:
                color = "Yellow";
                break;
            case 6:
                color = "Yellow";
                break;
            case 7:
                color = "White";
                break;
            case 8:
                color = "White";
                break;
            case 9:
                color = "Black";
                break;
            case 10:
                color = "Black";
                break;
            default:
                System.out.println("Un..unen..un..unexpected error");
        }
        System.out.println(nAnimal + ", " + nColor);
        System.out.println(animal + ", " + color);
    }
}
