import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int lastNum = -1;
        
        for (int n : arr) {
            if (n != lastNum) {
                list.add(n);
                lastNum = n;
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}