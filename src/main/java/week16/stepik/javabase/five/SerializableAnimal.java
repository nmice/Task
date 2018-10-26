package week16.stepik.javabase.five;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class SerializableAnimal {
    public static void main(String[] args) throws IOException {
        Animal[] animals = {new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"), new Animal("Cock"),
                new Animal("Bull"), new Animal("Ant"), new Animal("Tentecles"), new Animal("Worm")};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeInt(animals.length);
        for (int indexOfAnimals = 0; indexOfAnimals < animals.length; indexOfAnimals++) {
            objectOutputStream.writeObject(animals[indexOfAnimals]);
        }
        objectOutputStream.flush();
        objectOutputStream.close();
        Animal[] animalAfterSerialize = deserializeAnimalArray(byteArrayOutputStream.toByteArray());
        System.out.println(Arrays.toString(animalAfterSerialize));
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        // Создать поток байтов из массива байтов
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        try (ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)) {
            // Считать int
            int length = ois.readInt();
            // Создать массив объектов Animal
            Animal[] animals = new Animal[length];
            for (int i=0;i<length;i++){
                // Считать часть данных - записать в массив на месо 0-го элемента
                Animal deserAnimal = (Animal) ois.readObject();
                animals[i]=deserAnimal;
            }
            return animals;
        } catch (Exception e) {
            throw new IllegalArgumentException("oops...");
        }
    }

    private static class Animal implements Serializable {
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
