package HomeTraining.Cycles.Break;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // выход из цикла, даже если он не был завершен
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
 */
