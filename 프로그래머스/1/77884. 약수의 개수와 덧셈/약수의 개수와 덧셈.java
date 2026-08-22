class Solution {
    public int solution(int left, int right) {
        int result = 0;
        
        for (int i = left; i <= right; i++) {
            int divisor = getDivisor(i);
            
            result += divisor % 2 == 0 ? i : -i;
        }
        
        return result;
    }
    
    private int getDivisor(int num) {
        int result = 1;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                result++;
            }
        }
        
        return result;
    }
}