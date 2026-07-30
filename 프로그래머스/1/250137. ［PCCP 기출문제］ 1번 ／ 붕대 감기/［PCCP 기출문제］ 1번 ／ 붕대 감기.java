class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int hp = health; // 현재 체력
        int t = bandage[0]; // 시전 시간
        int x = bandage[1]; // 1초당 회복량
        int y = bandage[2]; // 추가 회복량
        int healingTime = 0; // 지속 시간
        int attackIdx = 0 ; // 공격
        
        // 공격이 끝날 때까지
        for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            // 공격
            if (i == attacks[attackIdx][0]) {
                hp -= attacks[attackIdx][1]; // 피해량
                healingTime = 0;
                attackIdx++;
                
                if (hp <= 0) {
                    return -1;
                }
            }
            // 회복
            else {
                hp += x;
                healingTime++;
                
                if (healingTime == t) {
                    hp += y;
                    healingTime = 0;
                }
                
                hp = Math.min(hp, health);
            }
        }
        
        return hp;
    }
}