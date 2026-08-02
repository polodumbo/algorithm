import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> yearningMap = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }
        
        int idx = 0;
        
        for (String[] people : photo) {
            int score = 0;
            
            for (String person : people) {
                score += yearningMap.getOrDefault(person, 0);
            }
            
            answer[idx++] = score;
        }
        
        return answer;
    }
}