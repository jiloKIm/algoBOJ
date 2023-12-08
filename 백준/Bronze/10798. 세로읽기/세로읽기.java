import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[5];


        for (int i = 0; i < 5; i++) {
            lines[i] = scanner.nextLine();
        }

        StringBuilder result = new StringBuilder();

    
        for (int i = 0; i < 15; i++) { 
            for (int j = 0; j < 5; j++) { 
                if (lines[j].length() > i) {
                    result.append(lines[j].charAt(i));
                }
            }
        }

        System.out.println(result.toString());
    }
}
