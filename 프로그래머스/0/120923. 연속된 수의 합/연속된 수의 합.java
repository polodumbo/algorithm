class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total / num;
        int midIdx = num % 2 == 0 ? num / 2 - 1 : num / 2;
        
        answer[midIdx] = mid;
        
        // 좌
        for (int i = midIdx; i >= 0; i--) {
            answer[i] = mid--;
        }
        
        mid = total / num;
            
        // 우
        for (int i = midIdx; i < num; i++) {
            answer[i] = mid++;
        }
        
        return answer;
    }
}