import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        
        for (char x : X.toCharArray()) {
            xCount[x - '0']++;
        }
        
        for (char y : Y.toCharArray()) {
            yCount[y - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(xCount[i], yCount[i]);
            
            sb.append(String.valueOf(i).repeat(min));
        }
        
        // 짝꿍이 존재하지 않으면
        if (sb.length() == 0) {
            return "-1";
        }
        
        // 짝꿍이 0으로만 구성되어 있다면
        if (sb.charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}