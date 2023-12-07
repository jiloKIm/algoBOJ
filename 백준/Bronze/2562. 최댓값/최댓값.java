import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[9]; 

        for (int i = 0; i < 9; i++) {
            int a = scanner.nextInt(); 
            if (a >= 1 && a <= 100) { 
                numbers[i] = a;
            } else {
                break; 
            }
        }

        int max = numbers[0];
        int index = 0;
        for (int i = 1; i < 9; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index + 1); 

        scanner.close();
    }
}
