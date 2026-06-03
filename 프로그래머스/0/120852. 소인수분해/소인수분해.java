import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new TreeSet<>();
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        
        int[] answer = new int[set.size()];
        int idx = 0;
        
        for (int num : set) {
            answer[idx++] = num;
        }
        
        return answer;
    }
}