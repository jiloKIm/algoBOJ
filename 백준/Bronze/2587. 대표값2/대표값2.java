import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]) throws IOException{

        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();

        for(int i=0;i<5;i++){
            int c=scanner.nextInt();
            list.add(c);
        }

        Collections.sort(list);

        Stream<Integer> langListStream = list.stream();
        long sum = langListStream.mapToInt(Integer::intValue).sum();


        System.out.println(sum/5);
        System.out.println((list.get(2)));








    }


}
