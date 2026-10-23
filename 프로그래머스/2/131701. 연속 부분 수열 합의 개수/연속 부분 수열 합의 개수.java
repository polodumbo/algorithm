import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        int[] arr = new int[len * 2];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = elements[i % len];
        }
        
        Set<Integer> set = new HashSet<>();
        
        //0 ~ len - 1
        for (int i = 0; i < len; i++) {
            int s = 0;
            // 1 ~ len
            for (int j = 1; j <= len; j++) {
                if (j == 1) {
                    s = arr[i];
                } else {
                    s += arr[i + j - 1];
                }
                set.add(s);
            }
        }
        
        return set.size();
    }
}