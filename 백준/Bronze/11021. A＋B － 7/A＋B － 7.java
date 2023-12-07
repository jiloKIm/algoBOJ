import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int inputs = Integer.parseInt(input);
        int[] c = new int[inputs];
        
        for (int i = 0; i < inputs; i++) {
            String inputd = reader.readLine();
            String[] ct = inputd.split(" ");
            
            for (int j = 0; j < ct.length; j++) {
                c[j] = Integer.parseInt(ct[j]);
                if (c[j] <= 0 || c[j] >= 10) {
                    System.out.println("Case #" + (i + 1) + ": " + "범위를 벗어났습니다.");
                    break; // Exit the loop for this case
                }
            }
            
            if (c[0] >= 1 && c[0] <= 9 && c[1] >= 1 && c[1] <= 9) {
                c[i] = c[0] + c[1];
                System.out.println("Case #" + (i + 1) + ": " + c[i]);
            }
        }
    }
}
