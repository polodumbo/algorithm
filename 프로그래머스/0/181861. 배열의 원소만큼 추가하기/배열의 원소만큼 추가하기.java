import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int total = 0;
        
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        
        int[] answer = new int[total];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(answer, idx, idx + arr[i], arr[i]);
            idx += arr[i];
        }
        
        return answer;
    }
}