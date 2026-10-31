import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> cMap = new HashMap<>(); // 철수
        Map<Integer, Integer> bMap = new HashMap<>(); // 동생
        
        // 모든 토핑을 철수에게
        for (int t : topping) {
            cMap.put(t, cMap.getOrDefault(t, 0) + 1);
        }
        
        // 동생한테 하나씩
        for (int t : topping) {
            bMap.put(t, bMap.getOrDefault(t, 0) + 1);
            cMap.put(t, cMap.get(t) - 1);
            
            if (cMap.get(t) == 0) {
                cMap.remove(t);
            }
            
            if (bMap.size() == cMap.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}