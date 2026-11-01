import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        List<String> list = new ArrayList<>();
        int answer = 0;
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        for (String city : cities) {
            city = city.toLowerCase();
            int idx = list.indexOf(city);
            
            if (idx != -1) {
                list.remove(idx);
                list.add(city);
                answer += 1;
            } else {
                if (list.size() >= cacheSize) {
                    list.remove(0);
                }
                
                list.add(city);
                answer += 5;
            }
        }
        
        return answer;
    }
}