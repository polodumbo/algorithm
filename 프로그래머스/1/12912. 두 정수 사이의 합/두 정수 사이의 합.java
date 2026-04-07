class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        double count = Double.parseDouble(String.valueOf(Math.abs(a - b) + 1)) / 2;
        
        answer = Math.round((a + b) * count);
        
        return answer;
    }
}