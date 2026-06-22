import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        StringTokenizer st;
        
        for (int i = 0; i < quiz.length; i++) {
            st = new StringTokenizer(quiz[i]);
            
            int x = Integer.parseInt(st.nextToken());
            char operator = st.nextToken().charAt(0);
            int y = Integer.parseInt(st.nextToken());
            char equal = st.nextToken().charAt(0);
            int z = Integer.parseInt(st.nextToken());
            
            if ((operator == '+' && x + y == z) ||
               (operator == '-' && x - y == z)) {
                
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}