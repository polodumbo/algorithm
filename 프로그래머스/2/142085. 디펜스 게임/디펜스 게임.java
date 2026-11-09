import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int round = 0;
        
        for (int i = 0; i < enemy.length; i++) {
            n -= enemy[i];
            pq.offer(enemy[i]);
            
            // 병사가 부족하다면
            if (n < 0) {
                // 무적권이 남아있다면 가장 적이 많이 나왔던 라운드에 무적권
                if (k > 0) {
                    n += pq.poll();
                    k--;
                } else {
                    // 무적권도 없고 병사도 부족하면 게임 종료
                    break;
                }
            }
            round++;
        }
        
        return round;
    }
}