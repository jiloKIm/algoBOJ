import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n >= 4 && n <= 1000) {
            n = n / 4;
            for (int i = 0; i < n; i++) {
                System.out.print("long ");
            }
        } 
            System.out.print("int ");
        
    }
}
