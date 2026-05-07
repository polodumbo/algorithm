import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb;
        
        for (int i = 0; i < picture.length; i++) {
            sb = new StringBuilder();
            
            for (int j = 0; j < picture[0].length(); j++) {
                char c = picture[i].charAt(j);
                
                for (int l = 0; l < k; l++) {
                    sb.append(c);
                }
            }
            
            for (int j = 0; j < k; j++) {
                answer[i * k + j] = sb.toString();
            }
        }
        
        return answer;
    }
}