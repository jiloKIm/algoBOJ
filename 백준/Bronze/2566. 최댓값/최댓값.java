import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrixA = new int[9][9];

    
        for (int i = 0; i < 9; i++) {
            String[] row = reader.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                matrixA[i][j] = Integer.parseInt(row[j]);
            }
        }

        int max = matrixA[0][0];
        int[] a = new int[2];


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < matrixA[i][j]) {
                    max = matrixA[i][j];
                    a[0] = i;
                    a[1] = j;
                }
            }
        }


        System.out.println(max);
        System.out.println(a[0] + 1 + " " + (a[1] + 1));
    }
}
