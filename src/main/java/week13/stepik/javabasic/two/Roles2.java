package week13.stepik.javabasic.two;

public class Roles2 {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder resultBuilder = new StringBuilder();
        for (String role : roles) {
            resultBuilder.append(role.concat(":").concat("\n"));
            for (int indexOfTextLine = 0; indexOfTextLine < textLines.length; indexOfTextLine++) {
                if (textLines[indexOfTextLine].startsWith(role.concat(":"))) {
                    resultBuilder.append(indexOfTextLine + 1);
                    resultBuilder.append(")".concat(textLines[indexOfTextLine].replaceFirst(role.concat(":"), "")).concat("\n"));
                }
            }
            resultBuilder.append("\n");
        }
        return resultBuilder.toString();
    }
}
