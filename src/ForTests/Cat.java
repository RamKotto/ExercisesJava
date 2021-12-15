package ForTests;

public class Cat extends Animal {


    @Override
    public void makeVoice() {
        System.out.println("I am a Cat!!!");
    }

    public void sayHello(Dog dog, String catName) {
        System.out.println("Hello " + dog.getName());
        AnimalRunnable animalRunnable = (str) -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + str);
            }
        };
        animalRunnable.run(catName);
    }
}
