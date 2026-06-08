class Solution {
    public int solution(int[] array, int n) {
        int diff = Math.abs(n - Integer.MAX_VALUE);
        int answer = Integer.MAX_VALUE;
        
        for (int num : array) {
            if (Math.abs(n - num) < diff) {
                diff = Math.abs(n - num);
                answer = num;
            } else if (Math.abs(n - num) == diff && num < answer) {
                answer = num;
            }
        }
        
        return answer;
    }
}