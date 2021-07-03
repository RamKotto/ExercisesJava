package HomeTraining.Classes.Static.StaticInitializers;

public class Program {
    public static void main(String[] args) {
        Person persOne = new Person();
        Person persTwo = new Person();
        Person persThree = new Person();

        persOne.displayId();
        persTwo.displayId();
        persThree.displayId();

        /*
        Static initializer
        Constructor
        Constructor
        Constructor
        Id: 105
        Id: 106
        Id: 107
         */
    }
}

class Person {
    private int id;
    static int counter;

    static {
        counter = 105;
        System.out.println("Static initializer");
    }

    Person() {
        this.id = counter++;
        System.out.println("Constructor");
    }

    public void displayId() {
        System.out.printf("Id: %d \n", id);
    }
}
