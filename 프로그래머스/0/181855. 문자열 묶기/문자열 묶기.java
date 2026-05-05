import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[31];
        
        for (int i = 0; i < strArr.length; i++) {
            int n = strArr[i].length();
            arr[n]++;
        }
        
        int max = 0;
        
        for (int n : arr) {
            max = Math.max(n, max);
        }
        
        return max;
    }
}