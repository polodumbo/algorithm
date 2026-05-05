import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[k];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            
            if (!set.contains(n)) {
                set.add(n);
                answer[idx] = n;
                idx++;
            }
            
            if (idx == k) {
                break;
            }
        }
        
        Arrays.fill(answer, idx, answer.length, -1);

        return answer;
    }
}