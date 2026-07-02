class Solution {
    public int solution(int[][] dots) {
        int xMin = Integer.MAX_VALUE;
        int yMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMax = Integer.MIN_VALUE;
        int len = dots.length;
        
        for (int i = 0; i < len; i++) {
            xMin = Math.min(xMin, dots[i][0]);
            yMin = Math.min(yMin, dots[i][1]);
            xMax = Math.max(xMax, dots[i][0]);
            yMax = Math.max(yMax, dots[i][1]);
        }
        
        return (xMax - xMin) * (yMax - yMin);
    }
}