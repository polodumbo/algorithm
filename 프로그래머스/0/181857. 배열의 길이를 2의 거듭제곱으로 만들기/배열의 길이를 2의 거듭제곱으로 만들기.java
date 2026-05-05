import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int newLength = 1;
        
        while (arr.length > newLength) {
            newLength *= 2;
        }
        
        return Arrays.copyOf(arr, newLength);
    }
}