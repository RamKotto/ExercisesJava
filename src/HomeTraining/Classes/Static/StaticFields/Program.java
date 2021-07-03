package HomeTraining.Classes.Static.StaticFields;

public class Program {
    public static void main(String[] args) {
        Person persOne = new Person();
        persOne.displayId();
        /*
        Id: 1
         */

        Person persTwo = new Person();
        persTwo.displayId();
        /*
        Id: 2
         */

        System.out.println(Person.counter);  // Следующей персоне будет присвоен Id = 3
        /*
        3
         */
    }
}

class Person {
    private int id;
    static int counter = 1;

    Person() {
        this.id = counter++;
    }

    public void displayId() {
        System.out.printf("Id: %d \n", id);
    }
}
