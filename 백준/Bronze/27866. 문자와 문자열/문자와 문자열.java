import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    String s=sc.nextLine();
    int i= sc.nextInt();
    char a=s.charAt(i-1);

    System.out.println(a);

    }
}