import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = map.getOrDefault(c, -1);
            
            answer[i] = n == -1 ? n : i - n;
            map.put(c, i);
        }
        
        return answer;
    }
}