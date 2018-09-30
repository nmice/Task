package week13.stepik.javabasic.two;

public class Roles {
    public static void main(String[] args) {
        String[] roles = {"Neo", "Trinity", "Morpheus"};
        String[] textLines = {"Neo: Help me!", "Morpheus: No Way!", "Neo: WTF, Man?", "Trinity: is Matrix", "Morpheus: Matrix?..."};
        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        for (int i = 0; i < textLines.length; i++) {
            String role = textLines[i].substring(0, textLines[i].indexOf(':'));


        }

        return "dc";
    }
}
