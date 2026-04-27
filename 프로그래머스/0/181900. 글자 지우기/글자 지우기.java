class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        
        boolean[] flags = new boolean[my_string.length()];
        for (int i : indices) {
            flags[i] = true;
        }
        
        for (int i = 0; i < my_string.length(); i++) {
            if (flags[i]) {
                continue;
            }
            
            sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}