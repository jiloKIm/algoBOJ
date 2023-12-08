import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputs = new int[2];
        inputs[0]=1;
        inputs[1]=1;
        Queue<String> q=new LinkedList<>();

        while(true) {
            String problem = reader.readLine();
            String[] input = problem.split(" ");

            for (int i = 0; i < input.length; i++) {
                inputs[i] = Integer.parseInt(input[i]);
            }
            if(inputs[0]==0& inputs[1]==0){
                break;
            }

            if (inputs[1] % inputs[0] == 0) {
                q.offer("factor");
            } else if (inputs[0] % inputs[1] == 0) {
                q.offer("multiple");
            } else {
                q.offer("neither");
            }

        }

        for(String s:q){

            System.out.println(s);
        }




    }
}
