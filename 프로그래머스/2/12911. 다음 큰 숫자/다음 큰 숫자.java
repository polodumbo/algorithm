class Solution {
    public int solution(int n) {
        int targetCount = Integer.bitCount(n);
        int answer = n + 1;

        while (Integer.bitCount(answer) != targetCount) {
            answer++;
        }

        return answer;
    }
}