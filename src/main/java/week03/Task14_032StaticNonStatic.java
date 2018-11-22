package week03;

public class Task14_032StaticNonStatic {

    public static class Cat{
        String name;
        static int catsCount = 1;

        public Cat(String name) {
            this.name = name;
            System.out.println(this.name + "\t" + catsCount++);
        }
    }

    public static void main(String[] args) {
        new Cat("Tommy");
        new Cat("Cory");
        new Cat("Marilyn");
    }
}
