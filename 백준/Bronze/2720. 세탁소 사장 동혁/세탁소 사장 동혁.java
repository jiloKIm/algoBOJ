import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);


        int T=sc.nextInt();
        int quater = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        int []a=new int[T];
        int []b=new int[T];
        int []c=new int[T];
        int []d=new int[T];
        for(int i=0;i<T;i++) {
            int money=sc.nextInt();
            a[i] = money / quater;
            b[i] = (money % quater) / dime;
            c[i] = ((money % quater) % dime) / nickel;
            d[i] = (((money % quater) % dime) % nickel) / penny;
        }
        for(int i=0;i<T;i++) {
            System.out.print(a[i] + " ");
            System.out.print(b[i] + " ");
            System.out.print(c[i] + " ");
            System.out.print(d[i] + " ");
            System.out.println();
        }

    }
}

