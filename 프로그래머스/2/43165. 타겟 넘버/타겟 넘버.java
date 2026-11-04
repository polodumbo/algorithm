class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        
        return answer;
    }

    private void dfs(int[] numbers, int target, int index, int sum) {
        // 모든 숫자를 다 사용했을 때
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        // 더하는 경우
        dfs(numbers, target, index + 1, sum + numbers[index]);

        // 빼는 경우
        dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}