class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            boolean possible = true;
            
            // 문장
            target:
            for (int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                
                // 글자
                int min = Integer.MAX_VALUE;
                for (String key : keymap) {
                    int idx = key.indexOf(c);
                    
                    if (idx != -1 && idx < min) {
                        min = idx;
                    }
                }
                
                // 키맵에 글자가 없다면
                if (min == Integer.MAX_VALUE) {
                    possible = false;
                    break target;
                }
                
                count += min + 1;
            }
            
            answer[i] = possible ? count : -1;
        }
        
        return answer;
    }
}