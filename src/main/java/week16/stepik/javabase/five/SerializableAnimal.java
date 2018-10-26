package week16.stepik.javabase.five;

import java.io.Serializable;
import java.util.Objects;

public class SerializableAnimal {
    public static void main(String[] args) {

    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        // your implementation here
    }

    class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
    }
}
