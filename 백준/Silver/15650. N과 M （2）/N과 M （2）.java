import java.util.Scanner;

public class Main {
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        arr = new int[M];

        solve(N, M, 0, 1);
        System.out.println(sb);
    }

    static void solve(int N, int M, int depth, int start) {
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            solve(N, M, depth + 1, i + 1);
        }
    }
}
