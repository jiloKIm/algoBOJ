import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

  
        int[][] matrixA = new int[N][M];
        int[][] matrixB = new int[N][M];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

 
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }


        int[][] resultMatrix = new int[N][M];

       
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
