import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N= scanner.nextInt();
        long[] snacks=new long[N];

        for(int i=0; i<N; i++){


            snacks[i]=scanner.nextInt();
        }
        Arrays.sort(snacks);

        int specialSnacksCount = 0;
        for (int i = 0; i < N; i++) { // 각 과자에 대해
            if (findSpecialSnack(snacks, i)) {
                specialSnacksCount++;
            }
        }

        System.out.println(specialSnacksCount);
    }

    // 특별한 과자 찾는 함수
    private static boolean findSpecialSnack(long[] snacks, int current) {
        int left = 0;
        int right = snacks.length - 1;

        while (left < right) {
            if (left == current) {
                left++;
             continue;
            } else if (right == current) {
                right--;
                continue;
            }
            long sum = snacks[left] + snacks[right];
            if (sum == snacks[current]) {
                return true;
            } else if (sum < snacks[current]) {
                left++;
            } else {
                right--;

            }


        }

        return false;
    }
}
