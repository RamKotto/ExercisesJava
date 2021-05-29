package GeekBrains.JavaIO.Lecture.partNine;

import java.io.*;
import java.util.Arrays;

public class Main {
    private static class Cat implements Serializable {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat " + this.name;
        }
    }

    public static void main(String[] args) {
        byte[] byteCat = null;
        try (ByteArrayOutputStream barrOut = new ByteArrayOutputStream();
             ObjectOutputStream objOut = new ObjectOutputStream(barrOut)) {
            Cat catOut = new Cat("Barsik");
            objOut.writeObject(catOut);
            byteCat = barrOut.toByteArray();
            System.out.println("Cat before serialization: " + catOut);
            System.out.println("Cat after serialization: " + Arrays.toString(byteCat));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ByteArrayInputStream barrIn = new ByteArrayInputStream(byteCat);
             ObjectInputStream objIn = new ObjectInputStream(barrIn)) {
            Cat catIn = (Cat) objIn.readObject();
            System.out.println("We return the cat from bytes: " + catIn);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
