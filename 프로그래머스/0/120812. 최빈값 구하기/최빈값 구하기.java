import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int n : array) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }
        
        int maxKey = 0;
        int maxValue = 0;
        boolean isDuplicate = false;
        
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxValue) {
                maxKey = key;
                maxValue = value;
                isDuplicate = false;
            } else if (value == maxValue) {
                isDuplicate = true;
            }
        }
        
        return isDuplicate ? -1 : maxKey;
    }
}