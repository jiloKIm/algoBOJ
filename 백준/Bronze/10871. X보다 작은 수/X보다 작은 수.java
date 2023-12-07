import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();
        long M = scanner.nextInt();
        int[] numbers = new int[N];
        if (N>=1 & M<=10000){
            for (int i = 0; i < N; i++) {
                numbers[i] = scanner.nextInt();
            }

        }

        int count = 0;


        for (int i = 0; i < N; i++) {
            if (numbers[i] < M) {
                System.out.print(numbers[i]+" ");
            }
        }





        scanner.close();
    }
}