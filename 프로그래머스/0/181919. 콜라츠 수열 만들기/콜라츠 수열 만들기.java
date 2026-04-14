import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> numList = new ArrayList<>();
        
        while (n != 1) {
            numList.add(n);
            
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        numList.add(1);
        
        int[] answer = new int[numList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}