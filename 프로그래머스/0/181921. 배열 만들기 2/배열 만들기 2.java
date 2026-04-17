import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> numList = new ArrayList<>();
        
        while (l % 5 != 0) {
            l++;
        }
        
        for (int i = l; i <= r; i += 5) {
            String s = String.valueOf(i);
            boolean isTarget = true;
            
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                
                if (!(c == '0' || c == '5')) {
                    isTarget = false;
                }
            }
            
            if (isTarget) {
                numList.add(i);
            }
        }
        
        if (numList.isEmpty()) {
            return new int[] {-1};
        }
        
        int[] answer = new int[numList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}