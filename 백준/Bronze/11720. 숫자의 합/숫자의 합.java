import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 숫자의 개수 N 입력
        int N = scanner.nextInt();
        
        // 개행 문자 소비
        scanner.nextLine();
        
        // 숫자들을 문자열로 입력
        String input = scanner.nextLine();
        
        // 문자열을 숫자로 변환하고 합산
        int sum = 0;
        for (int i = 0; i < N; i++) {
            char digitChar = input.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }
        
        // 합산 결과 출력
        System.out.println(sum);
        
        // 스캐너 닫기
        scanner.close();
    }
}
