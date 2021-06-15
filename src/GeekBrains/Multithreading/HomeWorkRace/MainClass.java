package GeekBrains.Multithreading.HomeWorkRace;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class MainClass {
    public static final int CARS_COUNT = 4;
    static Semaphore tunnel = new Semaphore(CARS_COUNT / 2, true);
    static CyclicBarrier start = new CyclicBarrier(CARS_COUNT);
    static CountDownLatch startLine = new CountDownLatch(CARS_COUNT);
    static CountDownLatch finishLine = new CountDownLatch(CARS_COUNT);
    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), race.getStages().size());
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        try {
            startLine.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        }
        try {
            finishLine.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
            System.out.println("\nПобедители гонки:");
            for (int i = 0; i < Car.champions.size(); i++) {
                System.out.printf((i + 1) + " место" + " -  %s" + "\n", Car.champions.get(i));
            }
        }
    }
}
