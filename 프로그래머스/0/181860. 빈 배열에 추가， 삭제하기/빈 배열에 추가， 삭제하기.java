import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            
            if (flag[i]) {
                for (int j = 0; j < n * 2; j++) {
                    deque.offerLast(n);
                }
            } else {
                for (int j = 0; j < n; j++) {
                    deque.pollLast();
                }
            }
        }
        
        int[] X = new int[deque.size()];
        
        for (int i = 0; i < X.length; i++) {
            X[i] = deque.poll();
        }
        
        return X;
    }
}