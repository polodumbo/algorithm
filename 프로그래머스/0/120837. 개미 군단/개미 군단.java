class Solution {
    public int solution(int hp) {
        int major = 5;
        int soldier = 3;
        
        int answer = 0;
        
        // 장군개미
        answer += hp / major;
        hp %= major;
        
        // 병정개미
        answer += hp / soldier;
        hp %= soldier;
        
        // 일개미
        answer += hp;
        
        return answer;
    }
}