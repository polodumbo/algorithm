class Solution {
    public int solution(int order) {
        String numStr = String.valueOf(order);
        int clap = 0;
        
        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            
            if (c == '3' || c == '6' || c == '9') {
                clap++;
            }
        }
        
        return clap;
    }
}