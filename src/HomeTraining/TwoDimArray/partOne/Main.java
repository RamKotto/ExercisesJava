package HomeTraining.TwoDimArray.partOne;

public class Main {
    public static void main(String[] args) {
        // Двумерный массив
        int[][] arrOne = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arrOne.length; i ++) {
            for (int j = 0; j < arrOne[i].length; j++) {
                System.out.print(arrOne[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(arrOne[2][0]);    // 7
        System.out.println(arrOne[1][2]);    // 6

        // tic tac toe Map
        String[][] arrTwo = {{"X", "X", "X"}, {"X", "X", "X"}, {"X", "X", "X"}};
        for (int i = 0; i < 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arrTwo.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < arrTwo[i].length; j++) {
                System.out.print(arrTwo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
