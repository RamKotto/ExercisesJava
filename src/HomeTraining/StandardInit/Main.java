package HomeTraining.StandardInit;

public class Main {
    public int i;
    public byte b;
    public short sh;
    public long l;
    public boolean bool;
    public char ch;
    public float fl;
    public double dbl;
    public String str;

    public Main () {

    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Инициализация примитивных типов по умолчанию: ");
        System.out.println("int: " + main.i);
        System.out.println("byte: " + main.b);
        System.out.println("short: " + main.sh);
        System.out.println("long: " + main.l);
        System.out.println("boolean: " + main.bool);
        System.out.println("char: " + main.ch);
        System.out.println("float: " + main.fl);
        System.out.println("double: " + main.dbl);
        System.out.println("Инициализация строк по умолчанию: ");
        System.out.println("String: " + main.str);
    }

    /*
    Вывод:
    Инициализация примитивных типов по умолчанию:
    int: 0
    byte: 0
    short: 0
    long: 0
    boolean: false
    char:
    float: 0.0
    double: 0.0
    Инициализация строк по умолчанию:
    String: null

    Process finished with exit code 0
     */
}

