import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length];
        int idx = 0;
        
        for (int i = 0; i < length; i++) {
            answer[idx++] = num_list[(i + n) % length];
        }
        
        return answer;
    }
}