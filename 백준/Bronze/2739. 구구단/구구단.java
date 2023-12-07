import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if (a >= 1 && a <= 9) {
            for (int i = 1; i <= 9; i++) { // Change the loop condition to i <= 9
                System.out.println(a + " * " + i + " = " + a * i);
            }
        }
    }
}
