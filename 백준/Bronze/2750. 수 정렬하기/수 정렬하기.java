import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{

        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> list =new ArrayList<>();

        for(int i=0;i<n;i++){
            int c=scanner.nextInt();
            list.add(c);
        }

        Collections.sort(list);


        for (int i:
             list) {
            System.out.println(i);

        }








    }


}