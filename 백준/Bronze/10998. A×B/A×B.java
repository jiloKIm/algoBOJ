import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int []score=new int[2];
      
     score[0]=sc.nextInt();
     score[1]=sc.nextInt();
        
     System.out.println(score[0]*score[1]);
    }
}