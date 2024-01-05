import java.util.Scanner;

public class Main {
    private static int[] array;
    private static int[] temp;
    private static int saveCount = 0;
    private static int K;
    private static int result = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        K = scanner.nextInt();

        array = new int[N];
        temp = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        mergeSort(0, N - 1);
        System.out.println(result);
    }

    private static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private static void merge(int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[t++] = array[i++];
            } else {
                temp[t++] = array[j++];
            }
            saveCount++;
            if (saveCount == K) {
                result = temp[t - 1];
            }
        }

        while (i <= mid) {
            temp[t++] = array[i++];
            saveCount++;
            if (saveCount == K) {
                result = temp[t - 1];
            }
        }

        while (j <= right) {
            temp[t++] = array[j++];
            saveCount++;
            if (saveCount == K) {
                result = temp[t - 1];
            }
        }

        i = left;
        t = 0;
        while (i <= right) {
            array[i++] = temp[t++];
        }
    }
}
