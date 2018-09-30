package week13.stepik.javabasic.two;

public class RoleTestDrive {
    public static void main(String[] args) {
        String myText = "uiiu: : kjkj";
        System.out.println(getBeforeTwoPoint(myText));
    }

    public static String getBeforeTwoPoint(String text){
        //return text.substring(0, text.indexOf(':'));
        return text.substring(text.indexOf(":") + 1).trim();

    }
}
