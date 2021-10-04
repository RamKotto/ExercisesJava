package HomeTraining.overload;

public class Jarvis {

    public void sayHi(String name) {
        System.out.println("Hello " + name + " how do you do?!");
    }

    public void sayHi(String...names) {
        for (String name : names) {
            System.out.println("Hello " + name + " how do you do?!");
        }
    }

    public static void main(String[] args) {
        Jarvis jrvs = new Jarvis();
        jrvs.sayHi("Mother", "Father", "Bro");
        jrvs.sayHi("Dima");
    }
}
