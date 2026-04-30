class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            int n = num_list[i];
            
            if (i % 2 == 0) {
                oddSum += n;
            } else {
                evenSum += n;
            }
        }
        
        return Math.max(oddSum, evenSum);
    }
}