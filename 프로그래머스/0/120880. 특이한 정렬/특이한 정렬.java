import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : numlist) {
            list.add(num);
        }
        
        list.sort((a, b) -> {
            int distanceA = Math.abs(a - n);
            int distanceB = Math.abs(b - n);
            
            if (distanceA == distanceB) {
                return b - a;
            }
            
            return distanceA - distanceB;
        });
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}