class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            char ch = ' ';
            
            // 대문자
            if (Character.isUpperCase(c)) {
                ch = (char) ((c + n - 'A') % 26 + 'A');
            }
            // 소문자
            else if (Character.isLowerCase(c)) {
                ch = (char) ((c + n - 'a') % 26 + 'a');
            }
            
            sb.append(ch);
        }
        
        return sb.toString();
    }
}