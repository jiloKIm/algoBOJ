import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        if (isAllLowerCase(a) && a.length() <= 50) {
            System.out.println(a + "??!");
        }
    }

    private static boolean isAllLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLowerCase(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}