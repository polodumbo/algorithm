import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : new int[]{a, b, c, d}) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int answer = 0;
        int size = map.size();
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((k1, k2) -> map.get(k2) - map.get(k1));

        if (size == 1) {
            answer = 1111 * keys.get(0);
        } else if (size == 2) {
            // 3-1 혹은 2-2
            int p = keys.get(0);
            int q = keys.get(1);
            
            if (map.get(p) == 3) {
                answer = (int) Math.pow(10 * p + q, 2);
            } else {
                answer = (p + q) * Math.abs(p - q);
            }
        } else if (size == 3) {
            answer = keys.get(1) * keys.get(2);
        } else {
            answer = Collections.min(keys);
        }
        
        return answer;
    }
}