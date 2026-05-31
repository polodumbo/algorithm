import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String numString = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[numString.length()];
        
        for (int i = 0; i < numString.length(); i++) {
            answer[i] = numString.charAt(i) - '0';
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}