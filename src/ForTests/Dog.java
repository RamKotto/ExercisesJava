package ForTests;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeVoice() {
        System.out.println("I am a Dog!!!");
    }
}
