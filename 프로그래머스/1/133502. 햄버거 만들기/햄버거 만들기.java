import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int[] arr = new int[ingredient.length];
        int idx = 0;
        int result = 0;
        
        int[] burger = {1, 2, 3, 1};
        int burgerLen = burger.length;
        
        for (int n : ingredient) {
            arr[idx++] = n;
            
            if (idx >= burgerLen && isMakeable(arr, idx, burger)) {
                result++;
                idx -= burgerLen;
            }
        }
        
        return result;
    }
        
    private boolean isMakeable(int[] arr, int idx, int[] burger) {
        int burgerLen = burger.length;

        for (int i = 0; i < burgerLen; i++) {
            if (arr[idx - burgerLen + i] != burger[i]) {
                return false;
            }
        }

        return true;
    }
}