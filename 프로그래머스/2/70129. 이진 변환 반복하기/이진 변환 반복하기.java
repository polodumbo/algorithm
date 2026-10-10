class Solution {
    public int[] solution(String s) {        
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            int len = s.length();
            String removedZero = s.replace("0", "");
            
            answer[0]++;
            answer[1] += len - removedZero.length();
            
            s = Integer.toBinaryString(removedZero.length());
        }
        
        return answer;
    }
}