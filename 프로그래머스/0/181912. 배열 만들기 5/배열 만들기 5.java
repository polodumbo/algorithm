import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> numList = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            int n = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (n > k) {
                numList.add(n);
            }
        }
        
        int[] answer = new int[numList.size()];
        
        for (int i = 0; i< answer.length; i++) {
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}