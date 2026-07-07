class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = Math.min(sides[0], sides[1]);
        int b = Math.max(sides[0], sides[1]);
        
        // b가 제일 긴 변
        // (b - a + 1) ~ b
        for (int i = b - a + 1; i <= b; i++) {
            answer++;
        }
        // answer += a - 1;
        
        // 나머지 한 변이 제일 긴 변
        // (b + 1) ~ (a + b - 1)
        for (int i = b + 1; i <= a + b - 1; i++) {
            answer++;
        }
        
        return answer;
    }
}