import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String problem = reader.readLine();
        String[] input = problem.split(" ");
        int[] inputs = new int[2];
        for (int i = 0; i < input.length; i++) {
            inputs[i] = Integer.parseInt(input[i]);
        }

        //나누기
        int n=0;
        for (int i = 1; i <= inputs[0]; i++) {

            if(inputs[0]%i==0){
                n++;
                if(n==inputs[1]){

                    System.out.println(i);
                    break;
                }

            }
        }

        if(n<inputs[1]){
            System.out.println(0);
        }





    }
}
