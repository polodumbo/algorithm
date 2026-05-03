import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int tokens = st.countTokens();
        String[] answer = new String[tokens];
        
        for (int i = 0; i < tokens; i++) {
            answer[i] = st.nextToken();
        }

        return answer;
    }
}