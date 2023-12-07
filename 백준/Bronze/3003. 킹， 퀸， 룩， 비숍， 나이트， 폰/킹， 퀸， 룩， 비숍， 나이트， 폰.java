import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int[] whitePieces = new int[6];
        for (int i = 0; i < 6; i++) {
            whitePieces[i] = scanner.nextInt();
        }
        
        
        int[] correctPieces = {1, 1, 2, 2, 2, 8};
        

        int[] result = new int[6];
        
      
        for (int i = 0; i < 6; i++) {
            result[i] = correctPieces[i] - whitePieces[i];
        }
        
 
        for (int i = 0; i < 6; i++) {
            System.out.print(result[i] + " ");
        }
        
       
  
    }
}
