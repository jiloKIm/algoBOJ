import java.util.Scanner;

public class Main {
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        arr = new int[M];
        visited = new boolean[N + 1];

        solve(N, M, 0);
        System.out.println(sb);
    }

    static void solve(int N, int M, int depth) {
        if (depth == M) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                solve(N, M, depth + 1);
                visited[i] = false;
            }
        }
    }
}
