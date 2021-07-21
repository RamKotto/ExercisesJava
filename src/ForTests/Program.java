package ForTests;

public class Program {
    public static void main(String[] args) {
        Worker bob = new Worker();
        String str = bob.work();
        System.out.println(str);
    }
}

class Worker {

    public Worker() {

    }

    private boolean amILucky() {
        double test = Math.random();
        System.out.println(test);
        return test > 0.5;
    }

    public String work() {
        return amILucky() ? "Еще работать и работать!" : "Пора домой!";
    }
}
