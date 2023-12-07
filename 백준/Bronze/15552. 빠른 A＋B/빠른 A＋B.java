import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int inputs = Integer.parseInt(input);

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < inputs; i++) {
            String inputd = reader.readLine();
            String[] ct = inputd.split(" ");
            int result = Integer.parseInt(ct[0]) + Integer.parseInt(ct[1]);
            output.append(result).append("\n"); // Append the result and a newline character
        }

        System.out.print(output.toString()); // Print all the results at once
    }
}
