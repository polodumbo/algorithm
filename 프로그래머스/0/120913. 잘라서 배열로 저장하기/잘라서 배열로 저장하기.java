class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() % n > 0 ? my_str.length() / n + 1 : my_str.length() / n;
        String[] answer = new String[length];
        
        for (int i = 0; i < answer.length; i++) {
            int start = i * n;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
    }
}