package HomeTraining.Cycles.Continue;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;  // при вополнении условия, переходит к следующей итерации цикла
            }
            System.out.println(i);
        }
    }
}

/*
Вывод:
0
1
2
3
4
6
7
8
9
 */
