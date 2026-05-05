class Solution {
    public int solution(String num_str) {
        int total = 0;
        
        for (int i = 0; i < num_str.length(); i++) {
            total += num_str.charAt(i) - '0';
        }
        
        return total;
    }
}