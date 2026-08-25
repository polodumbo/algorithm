import java.lang.StringBuilder;

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        sb.append(Integer.toString(n, 3)).reverse();
        
        return Integer.valueOf(sb.toString(), 3);
    }
}