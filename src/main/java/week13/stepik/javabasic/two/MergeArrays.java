package week13.stepik.javabasic.two;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a1 = {5};
        int[] a2 = {1, 3, 144};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));

    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] resultArray = new int[a1.length + a2.length];
        int a1Index = 0;
        int a2Index = 0;
        int a1Length = a1.length;
        int a2Length = a2.length;
        int resArLength = a1Length+a2Length;
        for (int resultIndex = 0; resultIndex < resArLength; resultIndex++) {
            if (a1Index == a1Length && a2Index < a2Length) resultArray[resultIndex] = a2[a2Index++];
            else if (a1Index < a1Length && a2Index == a2Length) resultArray[resultIndex] = a1[a1Index++];
            else if (a1[a1Index] < a2[a2Index]) resultArray[resultIndex] = a1[a1Index++];
            else resultArray[resultIndex] = a2[a2Index++];
        }
        return resultArray; // your implementation here
    }
}
