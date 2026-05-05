import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        for (int n : arr) {
            list.add(n);
        }
        
        for (int i = 0; i < delete_list.length; i++) {
            list.remove((Integer) delete_list[i]);
        }
        
        int[] result = new int[list.size()];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}