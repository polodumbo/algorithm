class Solution {
    public int[] solution(int[] arr) {
        int startIdx = -1;
        int endIdx = -1;
        
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            
            if (n == 2) {
                if (startIdx == -1) {
                    startIdx = i;
                }
                
                endIdx = i;
            }
        }
        
        if (startIdx == -1) {
            return new int[]{-1};
        }
        
        int[] answer = new int[endIdx - startIdx + 1];
        int idx = 0;
        
        for (int i = startIdx; i <= endIdx; i++) {
            answer[idx++] = arr[i];
        }
        
        return answer;
    }
}