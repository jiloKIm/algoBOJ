import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (a < 1 || a > 9 || b < 1 || b > 9) {
                System.out.println("범위를 벗어났습니다.");
                break;
            }
            
            arr[i] = a + b;
        }
        
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
