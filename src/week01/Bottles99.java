package week01;

public class Bottles99 {
    public static void main(String[] args) {
        int beerNum = 3;
        String word = " бутылок (бутылки)";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = " бутылка";
            }
            System.out.println(beerNum + word + " пива на стене");
            System.out.println(beerNum + word + " пива");
            System.out.println("Возьми одну, пусти по кругу");
            beerNum--;
            if (beerNum>0) {
                if (beerNum == 1) {
                    word = " бутылка";
                }
                System.out.println(beerNum + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
}