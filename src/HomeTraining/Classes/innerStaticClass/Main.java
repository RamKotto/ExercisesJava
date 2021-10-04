package HomeTraining.Classes.innerStaticClass;

public class Main {
    public static void main(String[] args) {
        Building.Shop shop = new Building.Shop("Grocery Store", "Fuji 12");

        System.out.println(shop.getType());

        Building.House house = new Building.House("my house", "Clover field 10");

        System.out.println(house.getType());
    }
}
