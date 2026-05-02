class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean isChanged = true;
        
        while (isChanged) {
            isChanged = false;
            
            for (int i = 0; i < arr.length; i++) {
                int n = arr[i];
                
                if (n >= 50 && n % 2 == 0) {
                    arr[i] /= 2;
                    isChanged = true;
                } else if (n < 50 && n % 2 == 1) {
                    arr[i] = n * 2 + 1;
                    isChanged = true;
                }
            }
            
            answer++;
        }
        answer--;
        
        return answer;
    }
}