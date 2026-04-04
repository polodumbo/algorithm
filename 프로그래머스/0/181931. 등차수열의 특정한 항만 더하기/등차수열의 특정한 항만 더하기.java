class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = included[0] ? a : 0;
        int now = a;
        
        for (int i = 1; i < included.length; i++) {
            now += d;
            if (included[i]) {
                answer += now;
            }
        }
        
        return answer;
    }
}