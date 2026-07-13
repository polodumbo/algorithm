class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[200];
        
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                arr[j]++;
            }
        }
        
        int answer = 0;
        
        for (int n : arr) {
            if (n > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}