class Solution {
    public int solution(String[] babbling) {
        String[] availableSounds = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            for (String str : availableSounds) {
                babbling[i] = babbling[i].replaceFirst(str, " ");
            }
            
            babbling[i] = babbling[i].replaceAll(" ", "");
                
            if (babbling[i].equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}