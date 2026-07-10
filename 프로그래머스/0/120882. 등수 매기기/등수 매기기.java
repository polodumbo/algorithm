import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        int[] sums = new int[n];
        
        for (int i = 0; i < n; i++) {
            sums[i] = score[i][0] + score[i][1];
        }
        
        for (int i = 0; i < n; i++) {
            int rank = 1;
            
            for (int j = 0; j < n; j++) {
                if (sums[j] > sums[i]) {
                    rank++;
                }
            }
            
            answer[i] = rank;
        }
        
        return answer;
    }
}