import java.util.Scanner;

public class Main {
    static int N;
    static int[][] ability;
    static boolean[] selected;
    static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        ability = new int[N][N];
        selected = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ability[i][j] = scanner.nextInt();
            }
        }

        divideTeam(0, 0);
        System.out.println(minDiff);
    }

    static void divideTeam(int index, int count) {
        if (count == N / 2) {
            updateMinDiff();
            return;
        }

        for (int i = index; i < N; i++) {
            if (!selected[i]) {
                selected[i] = true;
                divideTeam(i + 1, count + 1);
                selected[i] = false;
            }
        }
    }

    static void updateMinDiff() {
        int startTeam = 0, linkTeam = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (selected[i] && selected[j]) {
                    startTeam += ability[i][j];
                } else if (!selected[i] && !selected[j]) {
                    linkTeam += ability[i][j];
                }
            }
        }

        minDiff = Math.min(minDiff, Math.abs(startTeam - linkTeam));
    }
}
