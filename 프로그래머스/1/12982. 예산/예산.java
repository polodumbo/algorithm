import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            
            // 최대한 많은 부서
            if (budget < 0) {
                return i;
            }
        }
        
        // 모든 부서
        return d.length;
    }
}