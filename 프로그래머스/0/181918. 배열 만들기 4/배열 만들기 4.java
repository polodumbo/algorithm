import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numList = new ArrayList<>();
        
        int i = 0;
        while (i < arr.length) {
            if (numList.isEmpty()) {
                numList.add(arr[i++]);
                continue;
            }
            
            if (numList.get(numList.size() - 1) < arr[i]) {
                numList.add(arr[i++]);
            } else {
                numList.remove(numList.size() - 1);
            }
        }
        
        int[] stk = new int[numList.size()];
        
        for (int j = 0; j < stk.length; j++) {
            stk[j] = numList.get(j);
        }
        
        return stk;
    }
}