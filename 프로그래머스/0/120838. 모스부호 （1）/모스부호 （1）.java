import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = new String[]{
            ".-", "-...", "-.-.", "-..", ".",
            "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---",
            ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(letter);
        int length = st.countTokens();
        
        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            
            for (int i = 0; i < morse.length; i++) {
                if (str.equals(morse[i])) {
                    sb.append((char) (i + 'a'));
                }
            }
        }
        
        return sb.toString();
    }
}