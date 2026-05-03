import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> numList = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++){
            if (!strArr[i].contains("ad")) {
                numList.add(strArr[i]);
            }
        }
        
        String[] answer = new String[numList.size()];
        
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}