package HomeTraining.Classes.Static.StaticConstants;

public class Program {
    public static void main(String[] args) {
        double radius = 60;
        System.out.printf("Radius = %f \n", radius);
        System.out.printf("Area = %f \n", Math.PI * radius);
        /*
        Radius = 60,000000
        Area = 188,400000
         */
    }
}

class Math {
    public static final double PI = 3.14;
}
