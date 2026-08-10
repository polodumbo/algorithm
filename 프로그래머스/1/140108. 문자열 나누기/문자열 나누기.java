class Solution {
    public int solution(String s) {
        int stringCount = 0;
        int targetCount = 0;
        int otherCount = 0;
        char target = s.charAt(0);
        
        for (int i = 0; i < s.length(); i++) {
            if (targetCount == 0) {
                target = s.charAt(i);
            }
            
            if (s.charAt(i) == target) {
                targetCount++;
            } else {
                otherCount++;
            }
            
            if (targetCount == otherCount) {
                stringCount++;
                targetCount = 0;
                otherCount = 0;
            }
        }
            
        if (targetCount > 0) {
            stringCount++;
        }
        
        return stringCount;
    }
}