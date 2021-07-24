package HomeTraining.Classes.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Person worker = new Employee();
        Person client = new Client();

        worker.speakSomething();
        client.speakSomething();

        worker.eat("vegetables");
        client.eat("meat");

        /*
        I am working, sorry!
        Hello! I am a client!
        I ate vegetables
        I ate meat
         */
    }
}
