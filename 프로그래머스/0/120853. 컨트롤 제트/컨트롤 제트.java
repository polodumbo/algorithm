import java.util.*;

class Solution {
    public int solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int answer = 0;
        int before = 0;
        
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
        
            if (str.equals("Z")) {
                answer -= before;    
            } else {
                before = Integer.parseInt(str);
                answer += before;
            }
        }
        
        return answer;
    }
}