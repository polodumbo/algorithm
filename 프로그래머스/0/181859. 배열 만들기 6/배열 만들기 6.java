import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            
            if (stack.isEmpty()) {
                stack.offerLast(n);
            } else if (stack.getLast() == n) {
                stack.pollLast();
            } else {
                stack.offerLast(n);
            }
        }
        
        if (stack.isEmpty()) {
            return new int[]{-1};
        }
              
        int[] stk = new int[stack.size()];
        
        for (int i = 0; i < stk.length; i++) {
            stk[i] = stack.pollFirst();
        }
        
        return stk;
    }
}