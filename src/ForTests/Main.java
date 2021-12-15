package ForTests;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Woolfie");
        Animal cat = new Cat();

        dog.makeVoice();
        cat.makeVoice();
        ((Cat) cat).sayHello((Dog) dog, "Barsik");

        cat.makeVoice();
    }
}
