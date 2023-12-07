import java.util.Scanner;  
public class Main {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        for(int a =1;a<=num;a++){
            
            i=i*2;

        }
        i=i+1;
        int point=i*i;

        System.out.println(point);




    }
}