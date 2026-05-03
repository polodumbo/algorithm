import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] strings = myString.split("x");
        int length = strings.length;
        
        // 1차. StringTokenizer로 하면 오히려 너무 깔끔해서 안 됐다.
        // 2차. x가 마지막이라면 length + 1 해 0으로 초기화되게 함.
        if (myString.lastIndexOf('x') == myString.length() - 1) {
            length++;
        }
        
        int[] answer = new int[length];
        
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].length();
        }
        
        return answer;
    }
}