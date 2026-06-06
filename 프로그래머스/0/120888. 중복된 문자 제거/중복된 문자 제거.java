import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            set.add(my_string.charAt(i));
        }
        
        for (char c : set) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}