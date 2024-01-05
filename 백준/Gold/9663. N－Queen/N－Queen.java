import java.util.Scanner;

public class Main {
    static int N;
    static int count = 0;
    static int[] rows;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        rows = new int[N];

        placeQueen(0);
        System.out.println(count);
    }

    static void placeQueen(int row) {
        if (row == N) {
            count++;
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                rows[row] = col;
                placeQueen(row + 1);
                rows[row] = 0;
            }
        }
    }

    static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (rows[i] == col || Math.abs(row - i) == Math.abs(col - rows[i])) {
                return false;
            }
        }
        return true;
    }
}
