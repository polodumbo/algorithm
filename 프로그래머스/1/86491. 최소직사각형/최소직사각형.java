class Solution {
    public int solution(int[][] sizes) {
        int maxMin = 0; // 명함의 짧은 쪽
        int maxMax = 0; // 명함의 긴 쪽
        
        for (int[] size : sizes) {
            int min = Math.min(size[0], size[1]);
            int max = Math.max(size[0], size[1]);
            
            maxMin = Math.max(maxMin, min);
            maxMax = Math.max(maxMax, max);
        }
        
        return maxMin * maxMax;
    }
}