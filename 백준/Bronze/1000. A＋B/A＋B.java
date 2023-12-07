import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] score = new int[2]; // int 배열을 선언하고 크기를 2로 지정
      
      score[0] = sc.nextInt(); // 사용자로부터 첫 번째 숫자 입력 받음
      score[1] = sc.nextInt(); // 사용자로부터 두 번째 숫자 입력 받음
      
      System.out.println(score[0] + score[1]);
    }
}
