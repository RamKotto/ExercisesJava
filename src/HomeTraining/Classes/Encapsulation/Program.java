package HomeTraining.Classes.Encapsulation;

public class Program {
    public static void main(String[] args) {
        Person kate = new Person("Kate", 24);

        System.out.println(kate.getName());
        System.out.println(kate.getAge());

        kate.setName("Not Kate");
        kate.setAge(34);

        System.out.println(kate.getName());
        System.out.println(kate.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public static int persons_qty = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        persons_qty++;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
