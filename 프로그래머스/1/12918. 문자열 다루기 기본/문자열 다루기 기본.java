class Solution {
    public boolean solution(String s) {
        // 길이가 4 혹은 6
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        // 숫자로만 구성
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        return true;
    }
}