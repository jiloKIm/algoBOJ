import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] increase = new int[N]; // 증가하는 부분 수열 길이
        int[] decrease = new int[N]; // 감소하는 부분 수열 길이

        // 수열 A 입력받기
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 증가하는 부분 수열 찾기
        for (int i = 0; i < N; i++) {
            increase[i] = 1; // 최소 길이 1
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && increase[i] < increase[j] + 1) {
                    increase[i] = increase[j] + 1;
                }
            }
        }

        // 감소하는 부분 수열 찾기 (역순)
        for (int i = N - 1; i >= 0; i--) {
            decrease[i] = 1; // 최소 길이 1
            for (int j = N - 1; j > i; j--) {
                if (A[j] < A[i] && decrease[i] < decrease[j] + 1) {
                    decrease[i] = decrease[j] + 1;
                }
            }
        }

        // 가장 긴 바이토닉 부분 수열 길이 찾기
        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            maxLength = Math.max(maxLength, increase[i] + decrease[i] - 1);
        }

        System.out.println(maxLength);
        sc.close();
    }
}
