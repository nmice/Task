package week03;

/**
 * In a two-dimensional array, information is stored on the number of pupils in a particular class of each school
 * parallel from the first to the eleventh one (in the first line - information on the number of pupils in the first
 * classes, in the second - on the second, and so on). In each parallel there are 4 classes. Determine the average
 * number of students in the classes of each parallel.
 */

public class Task12_063 {

    public static void main(String... args) {
        int[][] studentsValue = new int[4][11];
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 11; j++) {
                studentsValue[i][j] = (int) (Math.random() * 33);
            }
        }

        for (i = 0; i < studentsValue.length; i++) {
            System.out.print("Students in parallel \"" + (i+1) + "\" : ");
            for (j = 0; j < studentsValue[i].length; j++) {
                System.out.print(studentsValue[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("AVERAGE NUMBER OF THE GROUP:");

        double[] result = new double[11];
        for (j=0; j<11; j++){
            result[j] = (double) (studentsValue[0][j] + studentsValue[1][j]+studentsValue[2][j]+studentsValue[3][j])/4;
            System.out.print(result[j] + "\t");
        }
    }
}
