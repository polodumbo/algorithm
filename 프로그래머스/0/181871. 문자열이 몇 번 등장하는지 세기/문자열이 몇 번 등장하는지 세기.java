class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            int idx = myString.indexOf(pat, i);
            if (idx != -1) {
                i = idx;
                answer++;
            }
        }
        
        return answer;
    }
}