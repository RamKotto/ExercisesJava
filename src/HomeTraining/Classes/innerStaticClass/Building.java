package HomeTraining.Classes.innerStaticClass;

public abstract class Building {
    private String name, address, type;

    Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static class Platform extends Building {
        public Platform(String name, String address) {
            super(name, address);
            setType("Platform");
        }

        // some additional logic
    }

    public static class House extends Building {
        public House(String name, String address) {
            super(name, address);
            setType("House");
        }

        // some additional logic
    }

    public static class Shop extends Building {
        public Shop(String name, String address) {
            super(name, address);
            setType("Shop");
        }

        // some additional logic
    }

    protected void setType(String buildingType) {
        this.type = buildingType;
    }

    public String getType() {
        return this.type;
    }
}
