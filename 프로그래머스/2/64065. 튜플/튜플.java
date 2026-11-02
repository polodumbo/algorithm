import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2).replace("},{", "-");
        
        String[] sets = s.split("-");
        Arrays.sort(sets, (o1, o2) -> o1.length() - o2.length());

        Set<Integer> set = new LinkedHashSet<>();

        for (String str : sets) {
            String[] numbers = str.split(",");
            
            for (String num : numbers) {
                set.add(Integer.parseInt(num));
            }
        }

        int[] answer = new int[set.size()];
        int idx = 0;
        
        for (int num : set) {
            answer[idx++] = num;
        }

        return answer;
    }
}