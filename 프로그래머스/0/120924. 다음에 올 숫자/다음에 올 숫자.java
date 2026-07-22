class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int len = common.length;
        int diff1 = common[1] - common[0];
        int diff2 = common[2] - common[1];        
        
        if (diff1 == diff2) {
            // 등차
            answer = common[len - 1] + diff1;
        } else {
            // 등비
            answer = common[len - 1] * (common[1] / common[0]);
        }        
        
        return answer;
    }
}