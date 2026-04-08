class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < numLog.length; i++) {
            int m = numLog[i - 1];
            int n = numLog[i];
            
            if (n - m == 1) {
                sb.append('w');
            } else if (n - m == -1) {
                sb.append('s');
            } else if (n - m == 10) {
                sb.append('d');
            } else {
                sb.append('a');
            }
        }
        
        return sb.toString();
    }
}