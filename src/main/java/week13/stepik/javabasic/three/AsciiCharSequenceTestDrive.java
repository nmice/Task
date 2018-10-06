package week13.stepik.javabasic.three;

public class AsciiCharSequenceTestDrive {

    public static void main(String[] args) {
        byte[] byteArray = {'d','y','o','c','l','a','s','s'};
        AsciiCharSequence testACS = new AsciiCharSequence(byteArray);
        System.out.println(testACS);
        System.out.println(testACS.length());
        System.out.println(testACS.charAt(2));
        System.out.println(testACS.subSequence(3,6));
    }


}
