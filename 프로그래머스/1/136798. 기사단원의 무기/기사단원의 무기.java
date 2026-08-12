class Solution {
    public int solution(int number, int limit, int power) {
        // 철
        int iron = 0;
        
        for (int i = 1; i <= number; i++) {
            // 약수
            int divCount = 0;
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divCount++;
                }
            }
            
            iron += divCount > limit ? power : divCount;
        }
        
        
        return iron;
    }
}