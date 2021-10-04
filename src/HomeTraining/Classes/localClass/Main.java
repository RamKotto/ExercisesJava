package HomeTraining.Classes.localClass;

public class Main {

    public static void main(String[] args) {
        Person pers = new Person("Dimas", "Beloostrovskaya", "18");

        Person.AddressContainer addressContainer = pers.getAddressContainer();
        System.out.println("Address: " + addressContainer.getStreet()  + " " + addressContainer.getHouse());
    }
}
