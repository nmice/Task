package week03;
/**
 * In the area of ​​12 districts. The number of inhabitants (in thousands) and the area (in km 2) of each
 * district are known. Determine the average population density in the region as a whole. *
 */

import java.util.Locale;
import java.util.Scanner;

public class Task05_064 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double peoples = 0, areas = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Inhabitants in " + i + " district (in thousands): ");
            double inhabitants = scanner.nextDouble();
            System.out.println("Area of " + i + " district (in km2): ");
            double areaDistrict = scanner.nextDouble();
            peoples += inhabitants;
            areas += areaDistrict;
        }
        //System.out.println(peoples + " " + areas);
        System.out.println("Population Density is: " + calcPopulationDensity(peoples, areas) + "(thousands people/km2)");
    }

    public static double calcPopulationDensity(double peoples, double areas) {
        return Math.rint(100.0 * peoples / areas)/100.0;
    }
}
