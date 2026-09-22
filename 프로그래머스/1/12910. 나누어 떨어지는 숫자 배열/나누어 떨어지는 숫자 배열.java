import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for (int n : arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }
        
        // divisor로 나누어 떨어지는 element가 하나도 없다면
        if (list.isEmpty()) {
            return new int[] {-1};
        }
        
        // 오름차순으로 정렬
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}