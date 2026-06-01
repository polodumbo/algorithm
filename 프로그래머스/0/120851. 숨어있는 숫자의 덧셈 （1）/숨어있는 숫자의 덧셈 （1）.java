class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String numString = my_string.replaceAll("[^0-9]", "");
        
        for (int i = 0; i < numString.length(); i++) {
            answer += numString.charAt(i) - '0';
        }
        
        return answer;
    }
}