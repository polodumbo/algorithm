import java.util.*;

class Solution {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        boolean isMinus = false;
        int answer = 0;
        
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            char c = str.charAt(0);
            
            if (c >= '0' && c <= '9') {
                int n = Integer.parseInt(str);
                
                answer += isMinus ? n * -1 : n;
                isMinus = false;
            } else if (str.equals("-")) {
                isMinus = true;
            }
        }
        
        return answer;
    }
}