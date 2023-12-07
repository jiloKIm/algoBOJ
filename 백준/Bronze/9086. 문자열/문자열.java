import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        int T = scanner.nextInt();
        

        scanner.nextLine();
        

        for (int i = 0; i < T; i++) {
  
            String inputString = scanner.nextLine();
            
            
            System.out.println(inputString.charAt(0) + "" + inputString.charAt(inputString.length() - 1));
        }
        
  
        scanner.close();
    }
}
