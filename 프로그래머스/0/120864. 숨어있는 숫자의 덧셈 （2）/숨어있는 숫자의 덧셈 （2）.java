class Solution {
    public int solution(String my_string) {
        String[] nums = my_string.split("[a-zA-Z]");
        int answer = 0;
        
        for (String str : nums) {
            if (str.length() > 0) {
                answer += Integer.parseInt(str);
            }
        }
        
        return answer;
    }
}