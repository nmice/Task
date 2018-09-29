package week13.stepik.javabasic.two;

public class Palindrome {

    public static void main(String[] args) {
       String text = "Madam, I'm Adam!";
        System.out.println(text + " is a palindrome - " + isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        String textWOCase = text.toLowerCase();
        String onlyLettersAndDigits = textWOCase.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        StringBuilder reverse = new StringBuilder(onlyLettersAndDigits).reverse();
        String result = reverse.toString();
        return result.equals(onlyLettersAndDigits); // your implementation here
    }
}
