public class Main {
    private static int recursionCount; // recursion 함수 호출 횟수를 기록할 변수

    private static int recursion(String s, int l, int r) {
        recursionCount++; // 함수가 호출될 때마다 카운트 증가
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    private static int isPalindrome(String s) {
        recursionCount = 0; // 새로운 문자열 검사 전에 카운트 초기화
        int result = recursion(s, 0, s.length() - 1);
        System.out.println(result + " " + recursionCount); // 결과와 호출 횟수 출력
        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // 숫자 입력 후 개행문자 처리
        for (int i = 0; i < T; i++) {
            String S = scanner.nextLine();
            isPalindrome(S);
        }
        scanner.close();
    }
}
