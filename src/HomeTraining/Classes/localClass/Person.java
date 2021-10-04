package HomeTraining.Classes.localClass;

public class Person {
    private String name, street, house;

    public Person(String name, String street, String house) {
        this.name = name;
        this.street = street;
        this.house = house;
    }

    public interface AddressContainer {
        String getStreet();
        String getHouse();
    }

    public AddressContainer getAddressContainer() {
        class PersonAddressContainer implements AddressContainer {
            final String street = Person.this.street, house = Person.this.house;

            @Override
            public String getStreet() {
                return this.street;
            }

            @Override
            public String getHouse() {
                return this.house;
            }
        }

        return new PersonAddressContainer();
    }
}
