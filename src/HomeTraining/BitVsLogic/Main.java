package HomeTraining.BitVsLogic;

public class Main {
    public static void main(String[] args) {
        // Преимущество логических операций перед побидовыми (а может и недостаток) =)
        if (true || check()) {
            System.out.println("В первом случае строка \"check\" не напечатается.");
            System.out.println("т.к. логические операвции - ленивые.");
        }
        if (true | check()) {
            System.out.println("Во втором случае строка \"check\" напечаетается =) (см выше)");
        }
    }

    public static boolean check() {
        System.out.println("Check");
        return true;
    }
}
