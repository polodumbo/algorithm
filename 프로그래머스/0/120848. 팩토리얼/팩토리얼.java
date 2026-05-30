class Solution {
    public int solution(int n) {
        int answer = 0;
        int value = 1;
        
        while (value <= n) {
            answer++;
            value *= answer;
        }
        
        return answer - 1;
    }
}