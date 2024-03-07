public class Solution {
    int count = 0; // 타겟 넘버를 만들 수 있는 경우의 수를 세는 변수

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0); // DFS 시작, 시작 인덱스와 현재 합계는 0
        return count;
    }

    public void dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) { // 모든 숫자를 다 확인했다면,
            if (sum == target) { // 현재 합계가 타겟 넘버와 같다면,
                count++; // 경우의 수를 하나 증가
            }
            return; // 리턴하여 재귀 종료
        }

        // 현재 숫자를 더하는 경우
        dfs(numbers, target, index + 1, sum + numbers[index]);

        // 현재 숫자를 빼는 경우
        dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}
