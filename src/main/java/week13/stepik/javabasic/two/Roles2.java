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
        StringBuilder resultBuilder = new StringBuilder("");
        for (int indexOfRole = 0; indexOfRole < roles.length; indexOfRole++) {
            resultBuilder.append(roles[indexOfRole]);
            resultBuilder.append(":\r\n");
            for (int index = 0; index < textLines.length; index++) {
                if (textLines[index].substring(0, textLines[index].indexOf(':')).equals(roles[indexOfRole])) {
                    resultBuilder.append((index + 1));
                    resultBuilder.append(")");
                    resultBuilder.append(textLines[index].substring(textLines[index].indexOf(":") + 1));
                    resultBuilder.append(index == textLines.length - 1 ? "" : "\r\n");
                }
            }
            resultBuilder.append(indexOfRole == roles.length - 1 ? "" : "\r\n");
        }
        return resultBuilder.toString();
    }
}
