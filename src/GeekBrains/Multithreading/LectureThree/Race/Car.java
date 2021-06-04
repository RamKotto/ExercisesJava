package GeekBrains.Multithreading.LectureThree.Race;


import java.util.ArrayList;

public class Car implements Runnable {
    private static int CARS_COUNT;
    static ArrayList<String> champions = new ArrayList<>();
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    public int stagesLeft;

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, int stagesLeft) {
        this.race = race;
        this.speed = speed;
        this.stagesLeft = stagesLeft;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            MainClass.startLine.countDown();
            MainClass.start.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        if (this.stagesLeft == 0) {
            champions.add(this.name);
            MainClass.finishLine.countDown();
        }
    }
}
