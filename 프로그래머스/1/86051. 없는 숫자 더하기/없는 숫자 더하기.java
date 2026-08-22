class Solution {
    public int solution(int[] numbers) {
        int[] counts = new int[10];
        
        for (int n : numbers) {
            counts[n]++;
        }
        
        int answer = 0;
        
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}