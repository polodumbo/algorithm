class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }
        
        // 가장 작은 수
        int min = Integer.MAX_VALUE;
        
        for (int n : arr) {
            min = Math.min(n, min);
        }
        
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        
        for (int n : arr) {
            if (n != min) {
                answer[idx++] = n;
            }
        }
        
        return answer;
    }
}